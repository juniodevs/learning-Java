import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numerodeBotas; //N
        int numeroDePares = 0; // Saída
        Scanner pegarDados = new Scanner(System.in);

        System.out.println("Digite o Numero de Botas");

        numerodeBotas = pegarDados.nextInt();
        if (numerodeBotas % 2 == 0)
    {
        char[] DouE = new char[numerodeBotas]; // L
        int[] botas = new int[numerodeBotas]; // M

        for (int i = 0; i < numerodeBotas; i++) {
            System.out.format("Bota de Número %d\n", i+1);
            System.out.println("Digite o tamanho da Bota");
            botas[i] = pegarDados.nextInt(); // Pegar tamanho da Bota

        if(botas[i] >= 30 && 60 >= botas[i]) // Verificar se é maior que 30 e menor que 60
        {
        System.out.format("Bota de Número %d\n", i+1);
        System.out.println("Digite D - Direito ou E - Esquerdo"); // Pegar pé da Bota
        DouE[i] = pegarDados.next().charAt(0);
            if (DouE[i] == 'D' || DouE[i] == 'E') {
            }
            else
            {
                System.out.println("Algo deu Erro, tente novamente");
                i--; // Volta 1 caso esteja errado
            }
        }
        else
        {
            System.out.println("Tamanho Errado, tente novamente");
            i--; // Volta 1 caso esteja errado
        }
        }
        int j = 0;
        for (int i = 0; i < numerodeBotas; i++) // Saída
        {
            while(j < numerodeBotas)
            {
                if(botas[i] == botas[j])
            {
                if(DouE[i] == 'E' && DouE[j] == 'D')
                {
                    numeroDePares++;
                    DouE[i] = ' ';
                    DouE[j] = ' '; // Para não ocorrer de formar par com uma bota que já foi formada
                }
            }
                j++;
            }
            j = 0;
        }
        System.out.println("\nSAÍDA");
        System.out.format("\nVocê tem %d pares feitos\n\n", numeroDePares);
    }
    else
    {
        System.out.println("O Número precisa ser Par");
    }

        pegarDados.close();
    }
}