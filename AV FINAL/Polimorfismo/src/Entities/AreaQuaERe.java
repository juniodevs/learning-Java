package Entities;
public class AreaQuaERe extends Area { // Area do Quadrado e do Retângulo

    public AreaQuaERe(double base , double altura) {
        super(base, altura); // Herança
    }
    // Classe calcularArea herdada da classe Area
    public String calcularArea() {
        if(getBase() != getAltura()) // Se a base for diferente da altura, é um retângulo
            return "O Quarado tem a area de: " + getAltura()*getBase(); // Area do Quadrado
        else
            return "O Retângulo tem a area de: " +getBase()*getAltura(); // Area do Retângulo
    }
    @Override
    public String toString() {
        return calcularArea();
    }
}
