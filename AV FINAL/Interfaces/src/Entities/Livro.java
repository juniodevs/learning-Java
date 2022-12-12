package Entities;

public class Livro {
    
    private String nome; // Atributos
    private String autor;
    private String editora;
    private String genero;

    public Livro(String nome, String autor, String editora, String genero) { // Construtor da classe
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos
    
    @Override  // Sobrescrevendo o método toString
    public String toString() {
        return "Autor: " + autor 
        + "\nLivro: " + nome
        + "\nEditora: " + editora
        + "\nGênero: " + genero;
    }
}
