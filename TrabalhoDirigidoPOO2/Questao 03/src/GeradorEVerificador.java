import java.util.Random;

public class GeradorEVerificador {
    
    public int gerarEVerificacao(int tamanhoArray)
    {
        int N = tamanhoArray;
        Random gerar = new Random();
        int maior = 0;

        int[] arrayDeValores = new int[N];

        for (int i : arrayDeValores) {
            arrayDeValores[i] = gerar.nextInt(100);
            System.out.println(arrayDeValores[i]);
            if (arrayDeValores[i] > maior) {
                maior = arrayDeValores[i];
            }
        }

        System.out.println("O Maior Valor é: " + maior);

        return 0;
    }
}