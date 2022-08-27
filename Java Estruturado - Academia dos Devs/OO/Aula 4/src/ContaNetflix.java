public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar() {
        buscarPreferenciasDoUsuario();
        buscarResolucao();
    }

    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }

    private void buscarResolucao()
    {
        resolucaoTela = "Full HD";
    }
    public void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme()
    {
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US")
        {
            System.out.println("Carregando áudio em " + idiomaPreferencial);
        }
        else
        {
            System.err.println("Carregando audio em EN-US");
        }
    }

}
