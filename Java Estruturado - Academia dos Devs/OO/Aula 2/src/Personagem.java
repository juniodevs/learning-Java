import java.util.Random;

public class Personagem {
    String nome;
    int HP;
    int level;
    int forca;

// void -> significa que não está retornando nada
void mostrarStatus(){
    System.out.format("Personagem: %s (lvl %d) com %d de força e %d de vida\n", nome, level, forca, HP);
};

int calcularDano()
{
    Random gerador = new Random();

    int dado20faces = 1 + gerador.nextInt(19);

    int dano = forca + dado20faces;
    
    return dano; // Método com Retorno
};

void atacar(String alvo, String habilidade){

    if (habilidade.length() == 0)
    {
        System.out.format("%s Atacou %s e causou %d de dano\n", nome, alvo, calcularDano());

    }
    else
    System.out.format("%s Atacou %s usando %s e causou %d de dano\n", nome, alvo, habilidade, calcularDano());
};

}
