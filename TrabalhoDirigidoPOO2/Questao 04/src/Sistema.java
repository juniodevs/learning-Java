import javax.swing.JOptionPane;

public class Sistema {
    private String digitarSenha;

    public void acessarSistema()
    {
        for (int i = 0; i < 1;) {
            System.out.println("Digite a Senha do Sistema");
            digitarSenha = JOptionPane.showInputDialog(null, "Digite Sua Senha");
            System.out.println(digitarSenha);

            if (digitarSenha.equals("a76dk09")) {
                i++;
                System.out.println("ACESSO PERMITIDO");
                System.out.println("Sistema sendo Encerrado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Senha Incorreta", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
