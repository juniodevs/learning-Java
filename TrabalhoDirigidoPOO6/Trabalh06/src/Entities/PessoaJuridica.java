package Entities;

import java.util.GregorianCalendar;

public class PessoaJuridica extends Pessoa {
    public String Cnpj;
    public GregorianCalendar DataCriacao;


    public PessoaJuridica()
    {
    }
    public PessoaJuridica(String nome, String cnpj, GregorianCalendar datacriacao)
    {
        super(nome);
        Cnpj = cnpj;
        DataCriacao = datacriacao;
    }

    public String getCnpj() {
        return Cnpj;
    }
    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }
    public GregorianCalendar getDataCriacao() {
        return DataCriacao;
    }
    public void setDataCriacao(GregorianCalendar dataCriacao) {
        DataCriacao = dataCriacao;
    }
    public String toString()
    {
        return
        "Nome: "
        + Nome
        + "Cnpj: " 
        + Cnpj 
        + "Data de Criacao: " 
        + DataCriacao;
    }
    
    //
    @Override
    public int CalcularIdade() {
        return 0;
    }

    @Override
    public boolean ValidarDocumento() {
        return false;
    }
}
