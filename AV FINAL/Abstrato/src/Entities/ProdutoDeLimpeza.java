package Entities;
public class ProdutoDeLimpeza extends Produto { // Herança da classe Produto
    public ProdutoDeLimpeza(String nome, double preco, double desconto) {
        super(nome, preco, desconto);
    }
    @Override // Sobrescrevendo o método abstrato da classe Produto
    public String etiquetaPreco() {
        return getNome() 
        + " R$ " 
        + String.format("%.2f", getPreco() - getDesconto()); // Sem entrega
    }
    @Override // Sobrescrevendo o método abstrato da classe Produto
    public String valorComEntrega() {
        return getNome() 
        + " R$ " 
        + String.format("%.2f", (getPreco() - getDesconto()) 
        + 2.0); // 2.0 é o valor da entrega
    }
}
