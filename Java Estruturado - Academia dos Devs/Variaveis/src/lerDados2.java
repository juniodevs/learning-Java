import java.util.Scanner;

public class lerDados2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String valor;
        int numero1;
        int numero2;
        valor = leitor.nextLine();
        numero1 = Integer.parseInt(valor);
        valor = leitor.nextLine();
        numero2 = Integer.parseInt(valor);
        // int = Integer
        // Float = Float
        // Double = Double
        System.out.println(numero1 + numero2);
        System.out.println(numero1 + 1);  
    }
}
