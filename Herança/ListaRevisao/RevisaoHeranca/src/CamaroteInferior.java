public class CamaroteInferior extends VIP {

    public String localizacao = "inferior";

    public CamaroteInferior(float valorIngresso, float valorAdicional)
    {
        super(valorIngresso, valorAdicional);
    }

    public void ImprimirCamaroteInferior()
    {
        System.out.println("R$" + super.imprimieAdicionalIncluso());
        System.out.println("Camarote " + localizacao);
    }
}
