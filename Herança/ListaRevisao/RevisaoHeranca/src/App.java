public class App {
    public static void main(String[] args) throws Exception {
        
        Ingresso IngressoPadrao = new Ingresso(10.00f);
        IngressoPadrao.imprimeValor();

        System.out.println("--------------------");

        Normal IngressoNormal = new Normal(20.00f);
        IngressoNormal.imprimirIngressoNormal();

        System.out.println("--------------------");

        VIP Ingressovip = new VIP(20.00f, 10.00f);
        System.out.println("Valor: R$" + Ingressovip.imprimieAdicionalIncluso());

        System.out.println("--------------------");

        CamaroteInferior camaroteInf = new CamaroteInferior(20.00f, 40.00f);
        camaroteInf.ImprimirCamaroteInferior();

        System.out.println("--------------------");

        CamaroteSuperior camaroteSup = new CamaroteSuperior(20.00f, 50.00f);
        camaroteSup.ImprimirCamaroteSuperior();
    }
}
