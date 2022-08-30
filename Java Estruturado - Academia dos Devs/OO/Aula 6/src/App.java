import javax.swing.JOptionPane;

import classes.Personagem;
//import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Pessoa pessoa = new Pessoa("João II", 18, 2.5f);

        // pessoa.setNome("João");
        // pessoa.setAltura(2.25);
        // pessoa.setIdade(18);

        // System.out.format("Nome: %s, Idade: %d, Altura: %.2f",
        // pessoa.getNome(),
        // pessoa.getIdade(),
        // pessoa.getAltura());

        String nome = JOptionPane.showInputDialog(null, "Nome do Personagem");
        String classe = JOptionPane.showInputDialog(null, "Nome da Classe");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}
