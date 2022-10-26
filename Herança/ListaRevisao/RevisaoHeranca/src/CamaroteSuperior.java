public class CamaroteSuperior extends VIP{
    public String localizacao = "Superior";

    public CamaroteSuperior(float valorIngresso, float valorAdicional)
    {
        super(valorIngresso, valorAdicional);
    }

    public void ImprimirCamaroteSuperior()
    {
        System.out.println("R$" + super.imprimieAdicionalIncluso());
        System.out.println("Camarote " + localizacao);
    }
}
