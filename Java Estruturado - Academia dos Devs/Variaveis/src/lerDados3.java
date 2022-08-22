import javax.swing.JOptionPane;

public class lerDados3 {
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual seu Filme preferido 2022 ate o momento", "title", JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "Digite um Número");

        int numero = Integer.parseInt(texto);

        numero = numero * 2;

        JOptionPane.showMessageDialog(null, "Seu filme favorito" + filme + "E Numero" + numero, "title", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(filme);
        System.out.println(numero);
    }
}
