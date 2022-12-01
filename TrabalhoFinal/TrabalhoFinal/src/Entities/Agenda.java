package Entities;

import java.util.ArrayList;

public class Agenda {
    private String Nome;
    private ArrayList<Contato> Contatos;

    public Agenda()
    {
    }
    public Agenda(String nome)
    {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

}
