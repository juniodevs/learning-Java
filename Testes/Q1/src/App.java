import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    private static final DecimalFormat df = new DecimalFormat("0");

    public static void main(String[] args) throws Exception {
        double numera = 1;
        double denomi = 3;
        double resultado = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Entrada");
        int N = sc.nextInt();
        int i = 0;
        while(i < N){
            System.out.print(df.format(numera) + "/" + df.format(denomi));
            if(i < N-1){
                System.out.print(" + ");
            }
            resultado = resultado + (numera/denomi);
            numera = numera + 1;
            denomi = denomi + 3;
            i++;
        }

        System.out.println("\n");
        System.out.println( new DecimalFormat("#,##0.00").format(resultado));

        sc.close();
    }
}
