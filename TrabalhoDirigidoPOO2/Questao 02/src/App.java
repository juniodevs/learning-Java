import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerar = new Random();
        int impar = 0, par = 0, neutro = 0, positivo = 0, negativo = 0;
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[]A = new int [N];

        for (int i = 0; i < A.length; i++) {
            A[i] = gerar.nextInt(100) - 50;
            System.out.println(A[i]);
            if (A[i] == 0){
                neutro++;
            }
            else if(A[i] % 2 == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
            if(A[i] > 0)
            {
                positivo++;
            }
            else
            {
                negativo++;
            }
        }
        System.out.format("Impares: %d, Pares: %d, Neutros: %d, Positivos: %d, Negativos: %d", impar, par, neutro, positivo, negativo);
        scanner.close();
    }
}
