import Entities.Livraria;
import Entities.Livro;

public class App {
    public static void main(String[] args) throws Exception { 

        Livraria livraria = new Livraria("Livraria do João", "Rua 1", "123456789");
        // Instanciando a Livraria e passando os parâmetros

        Livro livro1 = new Livro("Livro 1", "Autor 1", "Editora 1", "Gênero 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2", "Editora 2", "Gênero 2");
        // Cadastrando os livros

        livraria.cadastrarLivro(livro1); // Cadastrando o livro 1
        livraria.cadastrarLivro(livro2); // Cadastrando o livro 2
        livraria.listarLivros(); // Listando os livros cadastrados
        livraria.excluirLivro(livro1); // Excluindo o livro 1
        livraria.listarLivros(); // Listando os livros cadastrados novamente

        System.out.println(livraria);
        System.out.println("----------------------------");
        System.out.println(livro1);
        System.out.println("----------------------------");
        System.out.println(livro2); 
    }
}
// Interface é um conjunto de métodos que devem ser implementados por uma classe.
// Interface é uma classe abstrata que não pode ser instanciada.
// Interface é um contrato que deve ser cumprido por uma classe.
// Interface é uma classe com vários métodos abstratos e ela não pode ter atributos