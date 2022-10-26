public class Ingresso {
    public float ValorIngresso = 20.0f;

    public Ingresso(float valorIngresso) {
        ValorIngresso = valorIngresso;

        
    }

    public void imprimeValor()
    {
        System.out.println("Valor: R$" + ValorIngresso);
    }
    
}
