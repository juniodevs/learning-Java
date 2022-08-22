import java.util.Scanner;

public class lerDados {
    public static void main(String[] args) {
        String jogo;
        // Scanner -> classe
        System.out.println("Digite o Jogo");
        // Crio um ojbeto leitor para ler valores digitados no teclado
        Scanner leitor = new Scanner(System.in);
        // Configurando (definindo que os separados é ; OU \r OU \n)
        leitor.useDelimiter("[;\r\n]+");
        jogo = leitor.next();
        System.out.println("O Jogo é: " + jogo);
    }
}
