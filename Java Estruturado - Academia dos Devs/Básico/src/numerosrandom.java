import java.util.Random;

import javax.swing.JOptionPane;

public class numerosrandom {
    public static void main(String[] args) {
        // int dado6lados = 1 + (int) (Math.random() * 6);
        // JOptionPane.showMessageDialog(null, dado6lados);

        Random gerador = new Random();
        // int numero = 1 + gerador.nextInt(6);
        // JOptionPane.showMessageDialog(null, numero);

        int facesDados = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faces é o seu dado?"));
        int resultado = 1 + gerador.nextInt(facesDados);
        JOptionPane.showMessageDialog(null,"Você tirou " + resultado + " no dado");
    }
}
