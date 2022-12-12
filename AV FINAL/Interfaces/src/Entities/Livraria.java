package Entities;

import java.util.ArrayList;
import Interface.LivroInterface;

public class Livraria implements LivroInterface {
    
    private String nome; // Atributos
    private String endereco; 
    private String telefone;
    private ArrayList <Livro> livros = new ArrayList<Livro>(); // ArrayList para armazenar os livros
    

    public Livraria(String nome, String endereco, String telefone) { // Construtor da classe
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Métodos

    @Override // Sobrescrevendo os métodos da interface
    public void cadastrarLivro(Livro livro) { // Método para cadastrar um livro
        livros.add(livro);
    }

    @Override // Sobrescrevendo os métodos da interface
    public void excluirLivro(Livro livro) { // Método para excluir um livro
        livros.remove(livro);
    }

    @Override // Sobrescrevendo os métodos da interface
    public void buscarLivro(Livro livro) { // Método para buscar um livro
        for (Livro l : livros) {
            if (l.getNome().equals(livro.getNome())) {
                System.out.println("Livro encontrado!");
            }
        }
    }

    @Override // Sobrescrevendo os métodos da interface
    public void listarLivros() { // Método para listar todos os livros
        for (Livro l : livros) { 
            System.out.println("Nome: " + l.getNome());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Editora: " + l.getEditora());
            System.out.println("Gênero: " + l.getGenero());
            System.out.println("----------------------------");
        }
    }

    @Override // Sobrescrevendo os métodos da interface
    public String toString() { // Método para imprimir os dados da livraria
        return "Nome: " + nome 
        + "\nEndereço: " + endereco
        + "\nTelefone: " + telefone;
    }
}
