import festas.FestaVip;

public class App {
    public static void main(String[] args) throws Exception {
        // private
        // public
        // protected
        // default -> package private -> pacote privado

        ContaNetflix conta = new ContaNetflix();
        FestaVip festa = new FestaVip();
        festa.entrar();

        conta.entrar();
        conta.assistirFilme("Venom 2");
        conta.assistirFilme("Spider-Man No Way Home");

    }
}
