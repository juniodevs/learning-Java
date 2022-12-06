package models;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Exceptions.CustomException;

public class ContatoComercial extends Contato {
    public String cnpj;
    public Calendar data;
    
    public ContatoComercial(String nome, String telefone, String observacoes, String email, String cnpj, Calendar dataDeCriacao) {
        super(nome, telefone, observacoes, email);
        this.cnpj = cnpj;
        this.data = dataDeCriacao;

    }

    public CustomException validarData() throws CustomException
    {
        if (data.after(new GregorianCalendar().getTime()))
        {
            throw new CustomException("Data de criação inválida");
        }
        return null;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData() {
        return data;
    }

    public void setDataDe(Calendar dataDeCriacao) {
        this.data = dataDeCriacao;
    }

    public String getDataFormated(Calendar dataDeCriacao) { // Formata a DATA para String
        return dataDeCriacao.get(Calendar.DAY_OF_MONTH) 
        + "/" + dataDeCriacao.get(Calendar.MONTH) 
        + "/" + dataDeCriacao.get(Calendar.YEAR);
    }

    @Override
    public String toString() { // Formata a saída do objeto para String
        return super.toString() 
        + "CNPJ: " 
        + this.cnpj 
        + "\nData de criação: " 
        + getDataFormated(data);
    }
}
