import javax.swing.JOptionPane;
public class App {
	public static void main(String[] args) {
		
		int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o N do array"));
		int V[] = new int[N];
		System.out.println("Insira agora os valores do array v (um a um):");
		
		for (int i = 0; i < N; i++) {
			V[i] = Integer.parseInt(JOptionPane.showInputDialog(null, i+1 + " Insira agora os valores do array v (um a um):"));
		}
		
		int total = 0;
		for (int i : V) {
			total += i;
		}
		
		double media =  total / N;
		
		total = 0;
		for (int i : V) {
			total += Math.pow((i - media), 2);
		}
		
		double desvio = Math.sqrt(total/(N-1));
        JOptionPane.showMessageDialog(null, media, "Média", JOptionPane.CLOSED_OPTION);
        JOptionPane.showMessageDialog(null, desvio, "Desvio", JOptionPane.CLOSED_OPTION);
	}

}
