package classes;

public class Pessoa {
    // Atributos da Classe
    private String nome;
    private int idade;
    private double altura;

    // Método Construtor

    // <modificador> <nomeDaClasse> ()
    public Pessoa(String nome, int idade, float altura){
        System.out.println("Uma pessoa acaba de nascer!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        imprimirDados();
    }

    private void imprimirDados()
    {
        System.out.format("Nome: %s, Idade: %d, Altura: %.2f\n",
        nome,
        idade,
        altura);
    }

    // Métodos Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
