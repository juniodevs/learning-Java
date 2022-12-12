/*
1. Implemente pelo menos duas classes para exemplificar o conceito de
Encapsulamento. O seu exemplo deve ser original, portanto, descreva-o, explicando
para cada classe a lógica da aplicação do conceito de Encapsulamento. Forneça uma
classe App para apresentar a aplicação das suas classes em um método main. A
descrição textual deve ter no mínimo 5 linhas.
 */

import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pf = new PessoaFisica("João", "123.456.789-00", "123456789"); //Criando um objeto do tipo PessoaFisica
        PessoaJuridica pj = new PessoaJuridica("Empresa", "123.456.789/0001-00", "123456789"); //Criando um objeto do tipo PessoaJuridica
        System.out.println(pf); //Imprimindo o objeto do tipo PessoaFisica
        System.out.println(pj); //Imprimindo o objeto do tipo PessoaJuridica
    }
}

// A classe PessoaFisica possui os atributos nome, cpf e rg, e os métodos get e set para cada um deles.
// A classe PessoaJuridica possui os atributos nome e cnpj, e os métodos get e set para cada um deles.
// A classe App possui o método main, que cria dois objetos, um do tipo PessoaFisica e outro do tipo PessoaJuridica, e imprime os mesmos.