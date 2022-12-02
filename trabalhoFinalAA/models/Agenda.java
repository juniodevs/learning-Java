package com.mycompany.trabalhofinal.models;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        this.listaContatos = new ArrayList<Contato>();
    }

    public void setListaContatos(ArrayList listaContatos) {
        this.listaContatos = listaContatos;
    }

    public ArrayList getListaContatos() {
        return listaContatos;
    }
    
    public void adicionarContato(Contato c){
        this.listaContatos.add(c);
    }
    
    public void removerContato(Contato c){
        this.listaContatos.remove(c);
    }
    
    public void editarContato(int posicaoContato, Contato c){
        this.listaContatos.set(posicaoContato, c);
    }

    public void buscarContato(String nome){
        for (Contato contato : listaContatos) {
            if(contato.getNome().equals(nome)){
                System.out.println(contato);
            }
        }
    }

    public void fazerLigacao(Contato contato)
    {
        c.ligar(contato.getTelefone());
    }

    public void enviarMensagem(Contato contato, String texto){
        c.enviarSMS(contato.getTelefone(), texto);
    }

    public void enviarEmail(Contato contato, String texto){
        c.enviarEmail(contato.getEmail(), texto);
    }

}
