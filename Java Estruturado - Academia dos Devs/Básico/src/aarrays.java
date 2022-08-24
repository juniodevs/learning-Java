import java.util.Arrays;

public class aarrays {
    public static void main(String[] args) {
        //Vários valores do mesmo tipo

        String[] nomes = new String[5];

        nomes[0] = "João";
        nomes[1] = "Carlos";
        nomes[2] = "Ash";
        nomes[3] = "Jonathan";
        nomes[4] = "Lucas";

        System.out.println(nomes[1]);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        String[] nomes2 = new String[] {
            "Lucas", "João", "Carlos"
        };

        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);
        }

        int[] numeros = new int[100];

        Arrays.fill(numeros, 0);

        System.out.println(Arrays.toString(numeros));

    }
}
