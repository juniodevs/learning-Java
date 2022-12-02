package com.mycompany.trabalhofinal.models;

import java.util.Calendar;

public  class Contato {
    private String nome;
    private String telefone;
    private String observacoes;
    private Calendar dataNascimento;
    private String email;

    public Contato(String nome, String telefone, String observacoes, Calendar dataNascimento, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.observacoes = observacoes;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
    
}
