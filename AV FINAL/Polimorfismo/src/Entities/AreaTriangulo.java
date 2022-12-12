package Entities;

public class AreaTriangulo extends Area {

    public AreaTriangulo(double base, double altura) {
        super(base, altura);
    }
    // Classe calcularArea herdada da classe Area
    public String calcularArea() { 
        double resultado = (getBase()*getAltura())/2;
        return "O triângulo tem área de: " + resultado;
    }
    @Override
    public String toString() {
        return calcularArea();
    }
}

