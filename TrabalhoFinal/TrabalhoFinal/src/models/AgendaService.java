package models;

import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AgendaService {
    
    Scanner scan = new Scanner(System.in);



    public Contato cadastrarContatoService()
    {
        System.out.println("A Conta é Empresarial? (S/N)");
        String resposta = scan.nextLine();
        if(resposta.equals("S")){
            System.out.println("Digite o nome do contato: ");
            String nome = scan.nextLine();
            System.out.println("Digite o telefone do contato: ");
            String telefone = scan.nextLine();
            System.out.println("Digite as observações do contato: ");
            String observacoes = scan.nextLine();
            System.out.println("Digite o email do contato: ");
            String email = scan.nextLine();
            System.out.println("Digite o CNPJ do contato: ");
            String cnpj = scan.nextLine();
            Calendar dataDeCriacao = Calendar.getInstance();
            Contato contato = new ContatoComercial(nome, telefone, observacoes, email, cnpj, dataDeCriacao);
            return contato;
        }
        else{
            System.out.println("Digite o Apelido do Contato");
            String apelido = scan.nextLine();
            System.out.println("Digite o nome do contato: ");
            String nome = scan.nextLine();
            System.out.println("Digite o telefone do contato: ");
            String telefone = scan.nextLine();
            System.out.println("Digite o email do contato: ");
            String email = scan.nextLine();
            System.out.println("Digite as observações do contato: ");
            String observacoes = scan.nextLine();
            System.out.println("Digite a data de nascimento do contato: ");
            System.out.println("Digite o dia: ");
            int dia = scan.nextInt();
            System.out.println("Digite o mês: ");
            int mes = scan.nextInt();
            System.out.println("Digite o ano: ");
            int ano = scan.nextInt();
            Calendar dataDeNascimento = new GregorianCalendar(ano, mes, dia);
            Contato contato = new ContatoPessoal(apelido, nome, telefone, observacoes, email, dataDeNascimento);
            return contato;
        }
    }

    public Contato editarContatoService(Contato contato)
    {
        if(contato instanceof ContatoComercial){
            System.out.println("Digite o nome do contato: ");
            String nome = scan.nextLine();
            System.out.println("Digite o telefone do contato: ");
            String telefone = scan.nextLine();
            System.out.println("Digite as observações do contato: ");
            String observacoes = scan.nextLine();
            System.out.println("Digite o email do contato: ");
            String email = scan.nextLine();
            System.out.println("Digite o CNPJ do contato: ");
            String cnpj = scan.nextLine();
            Calendar dataDeCriacao = Calendar.getInstance();
            Contato contatoEditado = new ContatoComercial(nome, telefone, observacoes, email, cnpj, dataDeCriacao);
            return contatoEditado;
        }
        else{
            System.out.println("Digite o Apelido do Contato");
            String apelido = scan.nextLine();
            System.out.println("Digite o nome do contato: ");
            String nome = scan.nextLine();
            System.out.println("Digite o telefone do contato: ");
            String telefone = scan.nextLine();
            System.out.println("Digite o email do contato: ");
            String email = scan.nextLine();
            System.out.println("Digite as observações do contato: ");
            String observacoes = scan.nextLine();


            System.out.println("Digite a data de nascimento do contato: ");
            System.out.println("Digite o dia: ");
            int dia = scan.nextInt();
            System.out.println("Digite o mês: ");
            int mes = scan.nextInt();
            System.out.println("Digite o ano: ");
            int ano = scan.nextInt();
            Calendar dataDeNascimento = Calendar.getInstance();
            dataDeNascimento.set(ano, mes, dia);

            Contato contatoEditado = new ContatoPessoal(apelido, nome, telefone, observacoes, email, dataDeNascimento);
            return contatoEditado;
        }
    }

    
}
