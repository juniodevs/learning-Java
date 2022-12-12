package Entities;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in); // Abrindo o Scanner
    public Calculadora() {} // Construtor da classe Calculadora

    public double somar() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        return a + b;
    }
    public double subtrair() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        return a - b;
    }
    public double multiplicar() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        return a * b;
    }
    public double dividir() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        return a / b;
    }
    public double potencia() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = sc.nextDouble();
        return Math.pow(a, b);
    }
    public double raizQuadrada() throws Exception { // Throws Exception para tratar os erros
        System.out.println("Digite o número: ");
        double a = sc.nextDouble();
        return Math.sqrt(a);
    }
}