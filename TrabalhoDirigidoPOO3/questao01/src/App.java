import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<ContaDeLuz> contas = new ArrayList<>();
        ArrayList<String> faturas = new ArrayList<>();
        
        Scanner Read = new Scanner(System.in);
        int contaMaisCaraCodigo = 0, contaMenosCaraCodigo = 0;
        double contaMaisCara = 0, contaMenosCara = 0;
        boolean verificacaoDeContas = true;
        char auxilioDeVerificacao = 's';
        double soma = 0;

        while (verificacaoDeContas == true) {
            System.out.println("Conta " + (contas.size() + 1));
            System.out.println("Digite o (id / código) da sua conta: ");
            String contaCodigo = Read.next();

            System.out.println("Data da Leitura com ddMMyy");
            int dataLeitura = Read.nextInt();

            System.out.println("Informe a quantidade de Kw: ");
            int kwGasto = Read.nextInt();

            System.out.println("Valor da Conta: ");
            double precoDaConta = Read.nextDouble();
            soma += precoDaConta;

            if (contas.isEmpty()) {
                contaMaisCara = precoDaConta;
                contaMenosCara = precoDaConta;
            } else if(contaMaisCara<precoDaConta){
                contaMaisCara = precoDaConta;
                contaMaisCaraCodigo = contas.size();
            } else if(contaMenosCara>precoDaConta){
                contaMenosCara = precoDaConta;
                contaMenosCaraCodigo = contas.size();
            }

            contaMaisCaraCodigo = (contaMaisCara < precoDaConta) ? contas.size() : contaMaisCaraCodigo;
            contaMenosCaraCodigo = (contaMenosCara > precoDaConta) ? contas.size() : contaMenosCaraCodigo;

            System.out.println("Digite a data de vencimento apenas numeros (ddMMyyyy)");
            int dataVencimento = Read.nextInt();
            boolean estaPaga = false;
            boolean pagoNoPrazo = false;
            
            System.out.println("A conta foi paga? 's' ou 'n'");
            auxilioDeVerificacao = Read.next().charAt(0);
            if (auxilioDeVerificacao == 's' || auxilioDeVerificacao == 'S') {
                estaPaga = true;
                System.out.println("Digite a data de pagamento apenas numeros (ddMMyyyy)");
                int dataPagamento = Read.nextInt();
                pagoNoPrazo = (dataVencimento - dataPagamento) >= 0;
            }
            String verificacaoDePaga = estaPaga == true ? "Foi Paga": "Não foi Paga";
            faturas.add(verificacaoDePaga);

            ContaDeLuz conta = new ContaDeLuz(contaCodigo, dataLeitura, kwGasto, precoDaConta, dataVencimento, estaPaga, pagoNoPrazo);
            contas.add(conta);

            System.out.println(conta);

            System.out.println("Adicionar mais faturas? 's' ou 'n'");

            auxilioDeVerificacao = Read.next().charAt(0);

            if (auxilioDeVerificacao == 's' || auxilioDeVerificacao == 'S') {
                verificacaoDeContas = true;
            }
            else
            {
                verificacaoDeContas = false;
            }
        }
        System.out.println("\nFatura mais cara: Fatura " + (contaMaisCaraCodigo + 1) + "\n\n" + contas.get(contaMaisCaraCodigo));
        System.out.println(" ");
        System.out.println("\nFatura mais barata: Fatura " + (contaMenosCaraCodigo + 1) + "\n\n" + contas.get(contaMenosCaraCodigo));
        
        for (int i = 0; i < faturas.size(); i++){
            System.out.format("Fatura %d %s\n", i+1, faturas.get(i) );
        }
        
        System.out.println("Media de gasto: R$ " + soma / (contas.size()));

        Read.close();
    }
}