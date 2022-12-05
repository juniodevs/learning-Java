package models;

import java.util.ArrayList;
import java.util.Calendar;
import Exceptions.CustomException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<Contato>();
    }

    public void ListarContatos() // Método para listar os contatos
    {
        int i = 1;
        for (Contato contato : listaContatos) {
            System.out.print(i + " - ");
            System.out.println(contato.getNome());
            i++;
        }
    }

    public CustomException limiteDeContatos() throws CustomException { // Método para verificar se a agenda está cheia
        
        if (listaContatos.size() >= 100) {
            throw new CustomException("Limite de contatos atingido!");
        }
        return null;
    }

    public void adicionarContato(Contato c) { // Método para adicionar um contato
        this.listaContatos.add(c);
    }

    public void removerContato(Contato c) { // Método para remover um contato
        this.listaContatos.remove(c);
    }

    public void editarContato(Contato c, Contato novoContato) { // Método para editar um contato
        int index = this.listaContatos.indexOf(c);
        this.listaContatos.set(index, novoContato);
    }

    public CustomException ExcecaoValidar(GregorianCalendar data) throws CustomException { // Método para verificar se a data é válida
        if (data.after(new GregorianCalendar().getTime())) {
            throw new CustomException("Data Inválida");
        }
        return null;
    }

    public Contato buscarContato(String nome) { // Método para buscar um contato
        Scanner scan = new Scanner(System.in);
        System.out.println("Você deseja imprimir todos os dados? (S/N)");
        String resposta = scan.nextLine();
        if (resposta.equals("S")) { // Se a resposta for sim, imprime todos os dados
                for (Contato contatos : listaContatos) {
                    if (contatos.getNome().equals(nome)) {
                        System.out.println(contatos.toString());
                        System.out.println("--------------------------------------------------");
                    }
            }
        } else { // Se a resposta for não, imprime apenas o nome, telefone e email
            for (Contato contato : listaContatos) {
                if (contato.getNome().equals(nome)) {
                    System.out.println(contato.getNome());
                    System.out.println(contato.getTelefone());
                    System.out.println(contato.getEmail());
                    System.out.println("--------------------------------------------------");
                }
            }
        }
        return null; // Retorna null caso o contato não seja encontrado
    }

    public Contato buscarPorDataeMes(Calendar data) { // Método para buscar um contato por data e mês
        for (Contato contato : listaContatos) { // Percorre a lista de contatos
            if (contato.getData().get(Calendar.MONTH) == data.get(Calendar.MONTH) // Verifica se o mês é igual
                    && contato.getData().get(Calendar.DAY_OF_MONTH) == data.get(Calendar.DAY_OF_MONTH)) { // Verifica se o dia é igual
                System.out.println(contato.toString());
                System.out.println("--------------------------------------------------");
            }
        }
        return null; // Retorna null caso o contato não seja encontrado
    }

    public void enviarMensagem(Contato contato, String texto) { // Método para enviar mensagem
        contato.enviarSMS(contato.getTelefone(), texto); // Chama o método enviarSMS da classe Contato
    }

    public void enviarEmail(Contato contato, String texto) { // Método para enviar email
        contato.enviarEmail(contato.getEmail(), texto); // Chama o método enviarEmail da classe Contato
    }

    public void fazerLigacao(Contato contato) { // Método para fazer ligação
        contato.ligar(contato.getTelefone()); // Chama o método ligar da classe Contato
    }

}
