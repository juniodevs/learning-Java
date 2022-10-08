import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner Read = new Scanner(System.in);
        int x = 1, id;
        for (boolean i = true; i == true;) {
            System.out.println("Sistema de Agenda");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Atualizar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            x = Read.nextInt();
            switch (x) {
                case 1:
                    Contatos contato = Contatos.formContato();
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.println("Digite o id que quer atualizar");
                    id = Read.nextInt();
                    Contatos atualizarContato = Contatos.formContato();
                    agenda.atualizarContato(atualizarContato, id);
                    break;
                case 4:
                    agenda.listarContatos();
                    System.out.println("Digite o id para deletar");
                    id = Read.nextInt();
                    agenda.deletarID(id);
                    break;
                case 5:
                    System.out.println("Até a Próxima");
                    i = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    i = false;
                    break;
            }
        }
        Read.close();
    }
}
