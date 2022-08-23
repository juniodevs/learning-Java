import java.util.Scanner;

public class lerDados {
    private static Scanner leitor;

    public static void main(String[] args) {
        String jogo;
        // Scanner -> classe
        System.out.println("Digite o Jogo");
        leitor = new Scanner(System.in);
        // Configurando (definindo que os separados é ; OU \r OU \n)
        leitor.useDelimiter("[;\r\n]+");
        jogo = leitor.next();
        System.out.println("O Jogo é: " + jogo);
    }
}
