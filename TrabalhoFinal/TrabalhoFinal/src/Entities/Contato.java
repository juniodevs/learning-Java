package Entities;

import java.util.Calendar;

public class Contato {
    private String Nome;
    private String Telefone;
    private String Observacoes;
    private Calendar DataNascimento;

    public Contato()
    {}

    public Contato(String nome, String telefone, String observacoes, Calendar dataNascimento)
    {
        Nome = nome;
        Telefone = telefone;
        Observacoes = observacoes;
        DataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    public String getObservacoes() {
        return Observacoes;
    }
    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    public Calendar getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(Calendar DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

}
