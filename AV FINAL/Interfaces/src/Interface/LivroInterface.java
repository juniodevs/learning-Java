package Interface;
import Entities.Livro;

public interface LivroInterface { // Interface para os métodos da classe Livraria
    public void cadastrarLivro(Livro livro); // Método para cadastrar um livro
    public void excluirLivro(Livro livro); // Método para excluir um livro
    public void buscarLivro(Livro livro); // Método para buscar um livro
    public void listarLivros(); // Método para listar todos os livros
    public String toString(); // Método para imprimir os dados do livro
}
