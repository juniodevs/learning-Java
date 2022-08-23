import javax.swing.JOptionPane;

public class Incremento {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
            contador++;
        }
    }
}
