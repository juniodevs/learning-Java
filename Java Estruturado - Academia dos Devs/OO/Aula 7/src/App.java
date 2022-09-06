import classes2.PingPong;
import classes2.Videogame;
import classes2.Xadrez;

// import classes.CalculadorDeArea;
// import classes.Circulo;
// import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {

        // Circulo circulo = new Circulo(2);
        // // double area = circuloPequeno.calcularArea();
        // // System.out.println(area);
        // // System.out.println(circuloPequeno.calcularArea());
        // Quadrado quadrado = new Quadrado(5);
        // // System.out.println(quadrado.calcularArea());
        // CalculadorDeArea calculador = new CalculadorDeArea();
        // System.out.println(calculador.somarAreas(quadrado, circulo));
        Videogame xDevOne = new Videogame();
        xDevOne.jogar(new PingPong());
        xDevOne.fechar();
        xDevOne.ligar();
        xDevOne.jogar(new PingPong());
        xDevOne.fechar();
        xDevOne.jogar(new Xadrez());
        xDevOne.fechar();
    }
}
