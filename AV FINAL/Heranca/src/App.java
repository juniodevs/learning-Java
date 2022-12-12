import java.util.Calendar;
import java.util.GregorianCalendar;

import Entities.Contato;
import Entities.ContatoPessoal;
import Entities.ContatoEmpresarial;

public class App {
    public static void main(String[] args) throws Exception {

        Calendar data1= new GregorianCalendar(1990, 10, 10);

        Contato contato1 = new ContatoPessoal("João", "999999999", "joao@gmail.com", "Joãozinho", data1);
        Contato contato2 = new ContatoEmpresarial("JoãoEmpresa", "999999999", "joaoempresa@gmail.como", "123456789", "33333333");
        
        System.out.println(contato1);
        System.out.println(contato2);
    }
}

// Classe ContatoPessoal herdando da classe Contato
// Classe ContatoEmpresarial herdando da classe Contato
// A Classe ContatoPessoal possui os atributos nome, telefone, email, apelido e dataNascimento
// A Classe ContatoEmpresarial possui os atributos nome, telefone, email, cnpj e telefoneFixo
// A Classe Contato possui os atributos nome, telefone e email
// A Classe Contato possui o método toString
// A Classe ContatoPessoal possui o método toString que chama o método toString da classe Contato
// A Classe ContatoEmpresarial possui o método toString que chama o método toString da classe Contato
// o Método super chama o método da classe pai