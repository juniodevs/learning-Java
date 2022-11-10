import java.util.GregorianCalendar;
import Entities.*;

public class App {
    public static void main(String[] args){
		
            Pessoa[] pessoa = new Pessoa[6];
            pessoa[0] = new PessoaFisica("JOÃO SMITH", "537.742.340-27", new GregorianCalendar(2002, 5, 6));
            pessoa[1] = new PessoaJuridica("GÁS MANIA", "93.853.544/0001-87", new GregorianCalendar(2001, 1, 2));
            pessoa[2] = new PessoaJuridica("BOOK STORE", "43.017.995/0001-06", new GregorianCalendar(2005, 2, 3));
            pessoa[3] = new PessoaJuridica("WEBB CENTER", "45.405.216/0001-75", new GregorianCalendar(2003, 3, 5));
            pessoa[4] = new PessoaFisica("CHRISTIEBE CLERICE", "755.514.650-98", new GregorianCalendar(2005, 5, 2));
            pessoa[5] = new PessoaJuridica("WEBB CENTER", "45.405.216/0001-75", new GregorianCalendar(1995, 3, 1));

            ColecaoPessoa Dados = new ColecaoPessoa(pessoa);

            Dados.Inserir(new PessoaFisica("Christian Joabe", "794.474.000-27", new GregorianCalendar(2002, 3, 4)));
            Dados.Remover(0);
            Dados.Atualizar(1, new PessoaFisica("Jonhatan", "262346246", new GregorianCalendar(1992, 11, 23)));
            System.out.println("A Pessoa foi Encontrada? " + Dados.Pesquisar(new PessoaFisica("Christian Joabe", "794.474.000-27", new GregorianCalendar(2002, 3, 4))));
            System.out.println("A Coleção está sem dados? " + Dados.ColecaoEstaVazia());
            Dados.ImprimirDadosColecao();
            System.out.println("\nEssas Pessoas Físicas são iguais: " + pessoa[0].equals(pessoa[4]));
            System.out.println("Essas Pessoas Físicas são iguais: " + pessoa[2].equals(pessoa[5]));
            System.out.println(Dados.retornarObjeto(3));
    }
}
