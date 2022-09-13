import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner getter = new Scanner(System.in);
        System.out.println("Digite o N do Array");
        int N = getter.nextInt();
        GeradorEVerificador gerador = new GeradorEVerificador();

        gerador.gerarEVerificacao(N);

        getter.close();

    }
}
