
public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(2,2,'+'));
        System.out.println(calculadora.calcular(2,2,'-'));
        System.out.println(calculadora.calcular(2,2,'/'));
        System.out.println(calculadora.calcular(2,2,'*'));
        System.out.println(calculadora.calcular(2,9,'/'));
    }
}
