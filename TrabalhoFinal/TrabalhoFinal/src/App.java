import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import Exceptions.CustomException;
import models.Agenda;
import models.Contato;
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

        Calendar data1 = new GregorianCalendar(2020, 10, 10);

        Contato contato1 = new ContatoPessoal("Joao", "Joao", "222222222", "Ele e gente boa", "Joao@gmail", data1);
        Contato contato2 = new ContatoPessoal("Maria", "Maria", "333333333", "Ela e gente boa", "Maria@gmail", data1);
        Contato contato3 = new ContatoPessoal("Maria", "Maria", "333333333", "Ela e gente boa", "Maria@gmail", data1);

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        while(status){
        System.out.println("Menu de Agenda!");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Mostrar Contatos");
        System.out.println("3 - Editar Contato");
        System.out.println("4 - Remover Contato");
        System.out.println("5 - Buscar Contato");
        System.out.println("6 - Buscar Contato por Data");

        try{
        acao = scan.nextInt();
        }catch(Exception e){
            System.out.println("Digite um numero valido!");
            scan.nextLine();
            acao = 0;
        }
        switch(acao){
            case 1: 
            try{  
            agenda.adicionarContato(new AgendaService().cadastrarContatoService());
            }
            catch(CustomException e){
                System.out.println(e.getMessage());
            }
            break;
            case 2:
                System.out.println("LISTA DE CONTATOS");
                agenda.ListarContatos();
            break;
            case 3:
                System.out.println("EDITAR CONTATO");
                System.out.println("Digite o nome do contato que deseja editar");

                String nome = scan.next();
                Contato contatoAntigo = agenda.buscarContato(nome);
                if(contatoAntigo != null){
                    agenda.editarContato(contatoAntigo, new AgendaService().editarContatoService(contatoAntigo));
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
            case 4: 
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
            case 5:
                System.out.println("BUSCAR CONTATO");
                System.out.println("Digite o nome do contato que deseja buscar");
                String nomeBuscar = scan.next();
                agenda.buscarContato(nomeBuscar);
                break;
            case 6:
                try{
                System.out.println("BUSCAR CONTATO POR DATA");
                System.out.println("Digite o dia do contato que deseja buscar");   
                int dia = scan.nextInt();
                System.out.println("Digite o mês do contato que deseja buscar");   
                int mes = scan.nextInt();
                GregorianCalendar data = new GregorianCalendar();
                data.set(2021, mes, dia);
                Contato contatoData = agenda.buscarPorDataeMes(data);
                if(contatoData != null){
                    System.out.println("Contato encontrado");
                    System.out.println(contatoData);
                }else{
                    System.out.println("Contato não encontrado");
                }
                break;
                }catch(Exception a){
                    System.out.println("Data inválida");
                    scan.nextLine();
                    break;
                }
            case 8:
                status = false;
                System.out.println("1");
                break;
        }
    }
    scan.close();
}
}
