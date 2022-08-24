public class estruturaDeRepeticao {
    public static void main(String[] args) {
        
        int i = 0;
        while (i < 10) {
            System.out.println("Ola");
            i++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Olá com For");
        
        }

        i = 0;
        do {
            System.out.println("Ola com Do-While");
            i++;
        } while (i < 10);
    }
}
