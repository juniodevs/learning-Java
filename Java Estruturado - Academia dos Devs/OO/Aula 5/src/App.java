import classes.Pessoa;
import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getNome());
        pessoa.setNome("John");
        System.out.println(pessoa.getNome());


        System.out.println(pessoa.getIdade());
        pessoa.setIdade(18);
        System.out.println(pessoa.getIdade());

        System.out.println(pessoa.getAltura());
        pessoa.setAltura(1.87);
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.setDepositar(-200);
        conta.setDepositar(200);
        System.out.println(conta.getSaldo());
        }

}
