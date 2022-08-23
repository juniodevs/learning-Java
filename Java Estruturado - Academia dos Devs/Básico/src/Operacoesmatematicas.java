import javax.swing.JOptionPane;

public class Operacoesmatematicas {
    public static void main(String[] args) {
        int numeroA = 5;
        int numeroB = 6;

        int resultadosoma = numeroA + numeroB;
        int resultadosub = numeroA - numeroB;
        int resultadomult = numeroA * numeroB;
        double resultadodiv = (double) numeroA / numeroB;

        int resto = 10 % 2;

        Math.abs(10);
        Math.abs(-10);

        int elevado = (int)Math.pow(10, 2);
        int elevado2 = (int)Math.sqrt(2);
        double arredondar = Math.ceil(0.53); //Arredonda para o maior
        double arredondarparabaixo = Math.floor(2.76);
        double achaomenor = Math.min(10, 2);
        double achaomaior = Math.max(10, 2);

        JOptionPane.showMessageDialog(null, resultadosoma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultadosub, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultadomult, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultadodiv, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resto, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, elevado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, elevado2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, arredondar, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, arredondarparabaixo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, achaomenor, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, achaomaior, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
