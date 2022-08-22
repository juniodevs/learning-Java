public class App2 {
    public static void main(String[] args) {
        String nomeCompleto;
        nomeCompleto = "Son Goku";
        System.out.println(nomeCompleto);

        String filme = "Vingadores"; // Declarado
        int anolancamento = 2015;
        int duracao = 240;
        float nota = 9.8f;
        char letrainicial = 'V';
        boolean foiSucesso = true;

        System.out.println("O Filme: "+ filme);
        System.out.println("Ano de lancamento: "+ anolancamento);
        System.out.println("Duracao do Filme: "+ duracao);
        System.out.println("Nota: "+ nota);
        System.out.println("Letra Inicial: "+ letrainicial);
        System.out.println("Foi sucesso?: "+ foiSucesso);

        // O Filme <filme> Lancado em <ano> tem duracao de <duracao>
        System.out.println("O Filme "+ filme + " Lancado em " + anolancamento + " tem duracao de "+ duracao + " Minutos ");

        System.out.format("O Filme %s Lancado em %d tem duracao de %d Minutos \n", filme, anolancamento, duracao);

        String texto = ("O Filme "+ filme + " Lancado em " + anolancamento + " tem duracao de "+ duracao + " Minutos ");

        System.out.println(texto);

        String juntando1 = "Juntar a";
        String mensagem1 = " Mensagem";

        System.out.println(juntando1 + mensagem1);
    }
}
