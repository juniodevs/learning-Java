import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Exceptions.CustomException;
import models.Agenda;
import models.Contato;
import models.ContatoComercial;
import models.ContatoPessoal;
import models.AgendaService;

public class App {
    public static void main(String[] args) throws Exception {

        // Agenda agenda = new Agenda();

        // Contato contato1 = new ContatoPessoal("João", "999999999", "2222222", " ", null, "DAVYGOMES@GMAIL.COM");
        // agenda.adicionarContato(contato1);

        // agenda.enviarMensagem(contato1, "TESTE");
        // System.out.println();
        // agenda.enviarEmail(contato1, "TESTE");
        // System.out.println();
        // agenda.fazerLigacao(contato1);

        Scanner scan = new Scanner(System.in);
        boolean status = true;
        int acao;
        Agenda agenda = new Agenda();

        Calendar data1 = new GregorianCalendar(1995, 10, 10); // 10/11/1995 Data de nascimento Manual
        Calendar data2 = new GregorianCalendar(2002, 10, 29); // 29/11/2002 Data de nascimento Manual

        Contato contato1 = new ContatoPessoal("Joao", "Joao", "222222222", "Ele e gente boa", "Joao@gmail", data1);
        Contato contato2 = new ContatoPessoal("Maria", "Maria", "333333333", "Ela e gente boa", "Maria@gmail", data2);
        Contato contato3 = new ContatoPessoal("Maria", "Maria", "333333333", "Ela e gente boa", "Maria@gmail", data2);
        Contato contato4 = new ContatoComercial("WEBB", "99399999", "CENTRO DE PESQUISAS", "WEBBCENTER@GMAIL.COM", "22222222222", data2);


        agenda.adicionarContato(contato1); // Adiciona um contato manual
        agenda.adicionarContato(contato2); // Adiciona um contato manual
        agenda.adicionarContato(contato3); // Adiciona um contato manual
        agenda.adicionarContato(contato4); // Adiciona um contato manual

        while(status){
        System.out.println("---------------------------------");
        System.out.println("Menu de Agenda!");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Mostrar Contatos");
        System.out.println("3 - Editar Contato");
        System.out.println("4 - Remover Contato");
        System.out.println("5 - Buscar Contato");
        System.out.println("6 - Buscar Contato por Data");
        System.out.println("7 - Pessoa mais velha e a mais nova");
        System.out.println("8 - Enviar Mensagem");
        System.out.println("9 - Enviar Email");
        System.out.println("10 - Fazer Ligação");
        System.out.println("11 - Sair");
        System.out.println("---------------------------------");
        System.out.print("Digite a opção desejada: ");

        try{
        acao = scan.nextInt();
        }catch(Exception e){
            System.out.println("Digite um numero valido!");
            scan.nextLine();
            acao = 0;
        }
        switch(acao){
            case 1: // Cadastrar Contato
            try{  
            agenda.adicionarContato(new AgendaService().cadastrarContatoService());
            }
            catch(CustomException e){
                System.out.println(e.getMessage());
            }
            break;
            case 2: // Mostrar Contatos
                System.out.println("LISTA DE CONTATOS");
                agenda.ListarContatos();
            break;
            case 3: // Editar Contato
                System.out.println("EDITAR CONTATO");
                System.out.println("Digite o nome do contato que deseja editar");
                String nome = scan.next();
                Contato contatoAntigo = agenda.buscarContatoParaMesagem(nome);
                if(contatoAntigo != null){
                    agenda.editarContato(contatoAntigo, new AgendaService().editarContatoService(contatoAntigo));
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
            case 4: // Remover Contato
                System.out.println("REMOVER CONTATO");
                System.out.println("Digite o nome do contato que deseja remover");
                String nomeRemover = scan.next();
                Contato contatoRemover = agenda.buscarContato(nomeRemover);
                if(contatoRemover != null){
                    agenda.removerContato(contatoRemover);
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
            case 5: // Buscar Contato
                System.out.println("BUSCAR CONTATO");
                System.out.println("Digite o nome do contato que deseja buscar");
                String nomeBuscar = scan.next();
                agenda.buscarContato(nomeBuscar);
                break;
            case 6: // Buscar Contato por Data
                try{
                System.out.println("BUSCAR CONTATO POR DATA");
                System.out.println("Digite o dia do contato que deseja buscar");   
                int dia = scan.nextInt();
                System.out.println("Digite o mês do contato que deseja buscar");   
                int mes = scan.nextInt();
                GregorianCalendar data = new GregorianCalendar();
                data.set(2021, mes, dia);
                Contato contatoData = agenda.buscarPorDataeMes(data); // Busca por data e mes
                if(contatoData != null){ // Se o contato for diferente de nulo
                    System.out.println("Contato encontrado");
                    System.out.println(contatoData);
                }else{ // Se o contato for nulo
                    System.out.println("Contato não encontrado");
                }
                break;
                }catch(Exception a){
                    System.out.println("Data inválida");
                    scan.nextLine();
                    break;
                }
            case 7: // Pessoa mais velha e a mais nova
                System.out.println("PESSOA MAIS VELHA E A MAIS NOVA");
                agenda.pessoaMaisVelha(); // Mostra a pessoa mais velha
                System.out.println("----------------");
                agenda.pessoaMaisNova(); // Mostra a pessoa mais nova
                break;

            case 8: // Enviar Mensagem
                System.out.println("ENVIAR MENSAGEM");
                System.out.println("Digite o nome do contato que deseja enviar mensagem");
                String nomeMensagem = scan.next();
                Contato contatoMensagem = agenda.buscarContatoParaMesagem(nomeMensagem);
                if(contatoMensagem != null){
                    System.out.println("Digite a mensagem que deseja enviar");
                    String mensagem = scan.next();
                    agenda.enviarMensagem(contatoMensagem, mensagem);
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;

            case 9: // Enviar Email
                System.out.println("ENVIAR EMAIL");
                System.out.println("Digite o nome do contato que deseja enviar email");
                String nomeEmail = scan.next();
                Contato contatoEmail = agenda.buscarContatoParaMesagem(nomeEmail);
                if(contatoEmail != null){
                    System.out.println("Digite o email que deseja enviar");
                    String email = scan.next();
                    agenda.enviarEmail(contatoEmail, email);
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
            case 10: // Fazer Ligação
                System.out.println("FAZER LIGAÇÃO");
                System.out.println("Digite o nome do contato que deseja fazer ligação");
                String nomeLigacao = scan.next();
                Contato contatoLigacao = agenda.buscarContatoParaMesagem(nomeLigacao);
                if(contatoLigacao != null){
                    agenda.fazerLigacao(contatoLigacao);
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
            case 11:
                status = false;
                System.out.println("Saindo...");
                break;
        }
    }
    scan.close();
}
}
