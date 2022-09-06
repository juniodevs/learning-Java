package classes2;

public class Videogame {
    private boolean estaLigado;
    private Jogo jogo;
    public void ligar()
    {
        System.out.println("Ligando o Vídeo Game");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo)
    {
        if (estaLigado == true) {
            System.out.println("Iniciando o Jogo");
            this.jogo = jogo;
            jogo.jogar();
        }
        else
        {
            System.out.println("Video Game está desligado");
        }
    }

    public void fechar()
    {
        boolean temJogoRodando = jogo != null;
        if (estaLigado == true) {
            if (temJogoRodando) {
                System.out.println("Fechando o Jogo");
                jogo.fechar();
                jogo = null; // definindo valor de null que não está rodando
            }
            else
            {
                System.out.println("Não tem nenhum jogo rodando");
            }
        }
        else
        {
            System.out.println("Video Game está desligado");
        }
    }
}
