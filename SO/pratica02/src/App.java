import java.util.Random;

public class App {

    public static void main(String[] args) {
        // Criando o vetor primário
        int[] vetorPrimario = new int[1000];
        Random random = new Random();
        for (int i = 0; i < vetorPrimario.length; i++) {
            vetorPrimario[i] = random.nextInt(1000);
        }

        // Criando o vetor de múltiplos
        int[] vetorMultiplos = new int[1000];

        // Criando as threads
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MultiplosRunnable(i
            * 100
            ,(i + 1)
            * 100
            ,vetorPrimario,
            vetorMultiplos));
            
            threads[i].start();
        }

        // threads estão terminando de executar
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimindo o vetor de múltiplos
        for (int i = 0; i < vetorMultiplos.length; i++) {
            if (vetorMultiplos[i] != 0) {
                System.out.print(vetorMultiplos[i] + " ");
            }
        }
    }
    // Classe interna para implementar a interface Runnable
    static class MultiplosRunnable implements Runnable {
        private final int inicio;
        private final int fim;
        private final int[] vetorPrimario;
        private final int[] vetorMultiplos;

        public MultiplosRunnable(int inicio, int fim, int[] vetorPrimario, int[] vetorMultiplos) {
            this.inicio = inicio;
            this.fim = fim;
            this.vetorPrimario = vetorPrimario;
            this.vetorMultiplos = vetorMultiplos;
        }

        @Override
        public void run() {
            for (int i = inicio; i < fim; i++) {
                if (vetorPrimario[i] % 3 == 0 && vetorPrimario[i] % 7 == 0) {
                    vetorMultiplos[i] = vetorPrimario[i];
                }
            }
        }
    }
}
