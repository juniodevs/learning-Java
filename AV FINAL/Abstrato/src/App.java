import java.util.Calendar;
import Entities.Produto;
import Entities.ProdutoDeLimpeza;
import Entities.ProdutosAlimenticios;

public class App {
    public static void main(String[] args) throws Exception {

        Calendar dataValidade = Calendar.getInstance();
        dataValidade.set(2021, 10, 10);
        Produto p1 = new ProdutosAlimenticios("Arroz", 10.0, 0.1, dataValidade);
        System.out.println(p1.etiquetaPreco());
        System.out.print("Com entrega: ");
        System.out.println(p1.valorComEntrega());

        Produto p2 = new ProdutoDeLimpeza("Sabão", 5.0, 0.2);
        System.out.println(p2.etiquetaPreco());
        System.out.print("Com entrega: ");
        System.out.println(p2.valorComEntrega());
        
    }
}

// Classe Produto é abstrata, não pode ser instanciada
// Classe ProdutoDeLimpeza e ProdutosAlimenticios herdam de Produto
// Os métodos etiquetaPreco() e valorComEntrega() são abstratos e devem ser implementados nas classes filhas
// Classe e métodos abstratos não podem ser final ou private
// Uma classe abstrata pode ter métodos concretos e abstratos ao mesmo tempo
// Overrite é obrigatório em métodos abstratos nas classes filhas