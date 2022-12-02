package models;

import java.util.Calendar;

public class ContatoComercial extends Contato {
    public String cnpj;
    public Calendar dataDeCriacao;
    
    public ContatoComercial(String nome, String telefone, String observacoes, String email, String cnpj, Calendar dataDeCriacao) {
        super(nome, telefone, observacoes, email);
        this.cnpj = cnpj;
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Calendar dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
}
