package classes;

public class Circulo implements FiguraGeometrica{

    // Atributos
    private int raio;

    // Construtor

    public Circulo(int raio)
    {
        this.raio = raio;
    
    }
    // Métodos especificos da classe

    public double calcularArea(){
        // area = PI * raio^2
        return Math.PI * Math.pow(raio, 2);
    };

    // Métodos Getters e Setters

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
