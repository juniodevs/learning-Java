package classes;

import javax.swing.JOptionPane;

public class Personagem {
    // Atributos da Classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;
    
    // Método Construtor
    public Personagem(String nome, String classe)
    {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        if(classe == "Guerreiro")
        {
            forca = nivel * 2;
        }
        else
        {
            forca = nivel;
        }
    }
    // Métodos Específicos

    public void mostrarStatus()
    {
        String status = String.format("Nome: %s\nClasse: %s\nNível: %d\nVida: %d\nForça: %d",
        nome,
        classe,
        nivel,
        vida,
        forca);
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
