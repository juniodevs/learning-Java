package models;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<Contato>();
    }

    public void ListarContatos()
    {
        int i = 1;
        for (Contato contato : listaContatos) {
            System.out.print(i + " - ");
            System.out.println(contato.getNome());
            i++;
        }
    }
    
    public void adicionarContato(Contato c){
        this.listaContatos.add(c);
    }
    
    public void removerContato(Contato c){
        this.listaContatos.remove(c);
    }
    
    public void editarContato(Contato c, Contato novoContato){
        int index = this.listaContatos.indexOf(c);
        this.listaContatos.set(index, novoContato);
    }


    public Contato buscarContato(String nome){
    for (Contato contatoAntigo : listaContatos) {
        if(contatoAntigo.getNome().equals(nome)){
            return contatoAntigo;
        }
    }
    return null;
}


    public void enviarMensagem(Contato contato, String texto)
    {
        contato.enviarSMS(contato.getTelefone(), texto);
    }

    public void enviarEmail(Contato contato, String texto)
    {
        contato.enviarEmail(contato.getEmail(), texto);
    }

    public void fazerLigacao(Contato contato)
    {
        contato.ligar(contato.getTelefone());
    }

}
