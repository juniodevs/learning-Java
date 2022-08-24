public class Aula1 {
    public static void main(String[] args) throws Exception {
        // iPhone 12, tela de 6.1", 256GB
        // Galaxy Note 20 Ultra, tela 6.9", 256GB
        // Xiaomi Mi 11 Pro, tela de 6.81", 512GB
        // <tipoVariavel> nomeVariavel = valor;

        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.espacoDeArmazenamento = 256;
        celularA.sistemaOperacional = "iOS 11";
        celularA.tamanhoTela = 6.1f;

        Celular celularB = new Celular(); // objeto celularB
        celularB.nome = "Galaxy Note 20 Ultra"; // com o estado de nome definido para "Galaxy Note 20 Ultra"
        celularB.espacoDeArmazenamento = 256;
        celularB.sistemaOperacional = "Android 12";
        celularB.tamanhoTela = 6.9f;

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.espacoDeArmazenamento = 512;
        celularC.sistemaOperacional = "Android 12";
        celularC.tamanhoTela = 6.81f;

        System.out.format("Celular %s com tela de %s, com %s GB de Armazenamento e SO %s\n", celularA.nome ,celularA.tamanhoTela, celularA.espacoDeArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %s, com %s GB de Armazenamento e SO %s\n", celularB.nome ,celularB.tamanhoTela, celularB.espacoDeArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %s, com %s GB de Armazenamento e SO %s\n", celularC.nome ,celularC.tamanhoTela, celularC.espacoDeArmazenamento, celularC.sistemaOperacional);

    }
}
