package models;
import java.util.ArrayList;
import java.util.Calendar;
import models.Contato;
import models.ContatoComercial;
import models.ContatoPessoal;
import Exceptions.CustomException;
import java.util.GregorianCalendar;

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

    public CustomException ExcecaoValidar(GregorianCalendar data) throws CustomException
    {
    if (data.after(new GregorianCalendar().getTime()))
    {
        throw new CustomException("Data Inválida");
    }
    return null;
    }

    public Contato buscarContato(String nome){
    for (Contato contatoAntigo : listaContatos) {
        if(contatoAntigo.getNome().equals(nome)){
            System.out.println(contatoAntigo.toString());
            System.out.println("--------------------------------------------------");
        }
    }    
    return null;
}

    public Contato buscarPorDataeMes(Calendar data){
        for (Contato contato : listaContatos) {
            if(contato.getData().get(Calendar.MONTH) == data.get(Calendar.MONTH) && contato.getData().get(Calendar.DAY_OF_MONTH) == data.get(Calendar.DAY_OF_MONTH)){
                System.out.println(contato.toString());
                System.out.println("--------------------------------------------------");
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
