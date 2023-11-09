import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main(String[] args) {
        clearScreen();
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        clearScreen();
        System.out.println("Hello, World!");
    }

    // static int[][] MATRIZ =
    // {{1, 2, 3},
    // {4, 5, 6},
    // {7, 8, 9},
    // {10, 11, 12}};

    // static int NUM_THREADS = 3; // número de threads = número de colunas

    // public static void main(String[] args) {
    //     ExecutorService exec = Executors.newFixedThreadPool(NUM_THREADS);
    //     // cria pool de threads

    //     for (int i = 0; i < MATRIZ[0].length; i++) {
    //         int coluna = i;
    //         exec.execute(() -> inverterColuna(coluna));
    //     }

    //     exec.shutdown(); // encerra pool de threads

    //     while (!exec.isTerminated()) {
    //         // aguarda até que todas as threads terminem
    //     }

    //     imprimirMatriz(MATRIZ);
    // }

    // private static void inverterColuna(int coluna) {
    //     int i = 0;
    //     int j = MATRIZ.length - 1;

    //     while (i < j) {
    //         int temp = MATRIZ[i][coluna];
    //         MATRIZ[i][coluna] = MATRIZ[j][coluna];
    //         MATRIZ[j][coluna] = temp;
    //         i++;
    //         j--;
    //     }
    // }

    // private static void imprimirMatriz(int[][] matriz) {
    //     //Função para imprimir toda a Matriz
    //     for (int i = 0; i < matriz.length; i++) {
    //         for (int j = 0; j < matriz[0].length; j++) {
    //             System.out.print(matriz[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //}
}