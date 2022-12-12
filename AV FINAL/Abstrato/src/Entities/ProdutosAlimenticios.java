package Entities;
import java.util.Calendar;
public class ProdutosAlimenticios extends Produto { // Herança da classe Produto
    private Calendar dataValidade;
    public ProdutosAlimenticios(String nome, double preco, double desconto, Calendar dataValidade) {
        super(nome, preco, desconto);
        this.dataValidade = dataValidade;
    }
    public Calendar getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }
    @Override // Sobrescrevendo o método abstrato da classe Produto
        public String etiquetaPreco() {
        return getNome() 
        + " R$ " 
        + String.format("%.2f", getPreco() - getDesconto()) 
        + " (Validade: " 
        + dataValidade.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + dataValidade.get(Calendar.MONTH) 
        + "/" 
        + dataValidade.get(Calendar.YEAR) 
        + ")";
    }
    @Override // Sobrescrevendo o método abstrato da classe Produto
    public String valorComEntrega() {
        return getNome() 
        + " R$ " 
        + String.format("%.2f", (getPreco() - getDesconto() + 2.0)) 
        + " (Validade: " 
        + dataValidade.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + dataValidade.get(Calendar.MONTH) 
        + "/" 
        + dataValidade.get(Calendar.YEAR) + ")"; // 2.0 é o valor da entrega
    }
}
