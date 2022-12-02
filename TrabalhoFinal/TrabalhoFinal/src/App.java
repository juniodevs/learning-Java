import java.util.Scanner;


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
        Contato contato1 = new ContatoPessoal("LUCAS", "LUCAS", "2222222", " ",  "DAVYGOMES@GMAIL.COM");
        
        Contato contato2 = new ContatoPessoal("JOÃO 2 PARA LISTA", "João", "2222222", " ",  "DAVYGOMES@GMAIL.COM");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        while(status){
        System.out.println("Menu de Agenda!");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Mostrar Contatos");
        System.out.println("3 - Editar Contato");
        System.out.println("4 - Remover Contato");
        System.out.println("5 - Buscar Contato");
        System.out.println("6 - Sair do Sistema");      
        acao = scan.nextInt();
        switch(acao){
            case 1: 
            agenda.adicionarContato(new AgendaService().cadastrarContatoService());
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

                break;
            case 5:

                break;
            case 6:
                status = false;
                System.out.println("1");
                break;
        
        }
    }


    scan.close();
}
}
