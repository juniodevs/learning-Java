import java.util.Scanner;

public class Contatos {
    String nome;
    String telefone;
    String email;
    Contatos(){};
    Contatos(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }


    public static Contatos formContato(){
        Scanner Read = new Scanner(System.in);
        Contatos contato = new Contatos();
                System.out.println("Digite o Nome");
                contato.nome = Read.nextLine();
                System.out.println("Digite o Email");
                contato.email = Read.nextLine();
                System.out.println("Digite o Telefone");
                contato.telefone = Read.nextLine();
        return contato;
    }

    public String toString(int id) {
        return "Contato: ["+id+"]"
        + "Nome: " + nome
        + ", Telefone: "
        + telefone
        + ", Email: " + email;
    }
    
}
