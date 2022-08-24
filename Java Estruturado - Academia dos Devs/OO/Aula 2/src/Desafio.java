public class Desafio {
    public static void main(String[] args) {

        Desafio2 celularA = new Desafio2();

        celularA.marca = "iPhone 12";
        celularA.sistema = "iOS";
        celularA.armazenamento = 512;

        Desafio2 celularB = new Desafio2();

        celularB.marca = "Samsung A30";
        celularB.sistema = "Android 12";
        celularB.armazenamento = 1024;

        celularA.ligar();
        celularB.ligar();
    }
}
