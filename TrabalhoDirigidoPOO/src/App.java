import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numerodeBotas;
        Scanner pegarDados = new Scanner(System.in);

        System.out.println("Digite o Numero de Botas");

        numerodeBotas = pegarDados.nextInt();

        char[] DouE = new char[numerodeBotas];
        int[] botas = new int[numerodeBotas];

        for (int i = 0; i < numerodeBotas; i++) {
            System.out.format("Bota de Número %d\n", i+1);
            System.out.println("Digite o tamanho da Bota");
            botas[i] = pegarDados.nextInt();

        if(botas[i] >= 30 || 60 < botas[i])
        {
        System.out.format("Bota de Número %d\n", i+1);
        System.out.println("Digite D - Direito ou E - Esquerdo");
        DouE[i] = pegarDados.next().charAt(0);
            if (DouE[i] == 'D' || DouE[i] == 'E') {    
            }
            else
            {
                System.out.println("Algo deu Erro, tente novamente");
                i--;
            }
        }
        else
        {
            System.out.println("Tamanho Errado, tente novamente");
            i--;
        }
        }

        for (int i = 0; i < numerodeBotas; i++) {

        }

        
        pegarDados.close();
    }
}
