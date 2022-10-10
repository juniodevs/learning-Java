import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Dvd> DVDs = new ArrayList<>();
        Scanner Read = new Scanner(System.in);
        System.out.println("Quantos DVD's você deseja adicionar na Lista?");
        int quantidadeDeDvd = Read.nextInt();
        char auxilioDeVerificacao = ' ';

        for (int i = 0; i < quantidadeDeDvd; i++) {
            Read = new Scanner(System.in);
            System.out.println("Digite o nome do autor: ");
            String nome = Read.nextLine();
            Artistas autor = new Artistas();
            autor.setArtista(nome);
            System.out.println("O autor faz carreira solo? [S] Sim [N] Não");
            auxilioDeVerificacao = Read.next().charAt(0);
            if (auxilioDeVerificacao == 'S' || auxilioDeVerificacao == 's') {
                autor.setSoloArtista(true);
            } else {
                autor.setSoloArtista(false);
            }
            Read.nextLine();
            System.out.println("O nome do Autor é: " + autor.getArtista());
            Dvd dvd = new Dvd();
            System.out.println("Digite o ano:");
            int ano = Read.nextInt();
            Read.nextLine();
            dvd.setAno(ano);
            dvd.setAutor(autor);
            System.out.println("Digite o codigo do DVD:");
            int codigo = Read.nextInt();
            Read.nextLine();
            dvd.setCodigo(codigo);
            System.out.println("Digite o genero  do DVD:");
            String genero = Read.nextLine();
            dvd.setGenero(genero);
            System.out.println("Digite o nome da gravadora");
            String gravadora = Read.nextLine();
            dvd.setGravadora(gravadora);
            System.out.println("Digite o titulo do DVD");
            String titulo = Read.nextLine();
            dvd.setTitulo(titulo);
            System.out.println("Digite o valor do DVD:");
            double valor = Read.nextDouble();
            Read.nextLine();
            dvd.setValor(valor);
            DVDs.add(dvd);
        }
        System.out.println(DVDs);
        PrecoTotal(DVDs);
        dvdprecomenor(DVDs);
        dvdmaiorpreco(DVDs);
        autoresSolos(DVDs);
        Read.close();
    }

    public static void PrecoTotal(List<Dvd> DVDs) {
        double total = 0;
        for (int i = 0; i < DVDs.size(); i++) {
            total += DVDs.get(i).getValor();
        }
        System.out.println("Valor de DVDs: " + total);
    }

    public static void dvdprecomenor(List<Dvd> DVDs) {
        Dvd dvd = null;
        double precoAtual = 99999999;
        for (int i = 0; i < DVDs.size(); i++) {
            if (DVDs.get(i).getValor() < precoAtual) {
                precoAtual = DVDs.get(i).getValor();
                dvd = DVDs.get(i);
            }
        }
        System.out.println("Este é o mais barato: " + dvd);
    }

    public static void dvdmaiorpreco(List<Dvd> DVDs) {
        Dvd dvd = null;
        double precoAtual = 0.0;
        for (int i = 0; i < DVDs.size(); i++) {
            if (DVDs.get(i).getValor() > precoAtual) {
                precoAtual = DVDs.get(i).getValor();
                dvd = DVDs.get(i);
            }
        }
        System.out.println("Esse DVD é o mais caro:" + dvd);
    }

    public static void autoresSolos(List<Dvd> DVDs) {
        List<Dvd> dvdssolo = new ArrayList<>();
        for (int i = 0; i < DVDs.size(); i++) {
            if (DVDs.get(i).getAutor().isSolo()) {
                dvdssolo.add(DVDs.get(i));
            }
        }
        System.out.println("O Autor desse DVD é Solo: " + dvdssolo);
    }
}