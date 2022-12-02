package models;

import java.util.Scanner;
import java.util.Calendar;

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
            Contato contato = new ContatoPessoal(apelido, nome, telefone, observacoes, email);
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
            Contato contatoEditado = new ContatoPessoal(apelido, nome, telefone, observacoes, email);
            return contatoEditado;
        }
    }
}
