package Entities;

import java.util.GregorianCalendar;


public class PessoaFisica extends Pessoa {
    public String Cpf;
    public GregorianCalendar DatadeNascimento;


    public PessoaFisica()
    {
    }
    public PessoaFisica(String nome, String cpf, GregorianCalendar datadeNascimento)
    {
        super(nome);
        Cpf = cpf;
        DatadeNascimento = datadeNascimento;
    }

    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public GregorianCalendar getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(GregorianCalendar datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }


    public String toString()
    {
        return
        "Nome: "
        + Nome
        + "Cpf: " 
        + Cpf 
        + "Data de Nascimento: " 
        + DatadeNascimento;
    }

    //
    @Override
    public int CalcularIdade() {
        return 0;
    }

    @Override
    public boolean ValidarDocumento() {
        if (Cpf.length() == 14)
        return true;
        else
        return false;
    }
}
