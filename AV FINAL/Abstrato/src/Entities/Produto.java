package Entities;
abstract public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public Produto(String nome, double preco, double desconto) { // Construtor da classe Produto
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    
    // Getters e Setters

    public String getNome() { 
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public abstract String etiquetaPreco(); // Método abstrato não tem implementação
    public abstract String valorComEntrega(); // Método abstrato não tem implementação
}
