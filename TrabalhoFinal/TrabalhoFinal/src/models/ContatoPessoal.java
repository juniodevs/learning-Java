package models;

import Exceptions.CustomException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContatoPessoal extends Contato{
    public String apelido;
    public String emailPessoal;
    public Calendar data;

    public ContatoPessoal(String apelido, String nome, String telefone, String observacoes, String email, Calendar dataDeNascimento) {
        super(nome,  telefone, observacoes, email);
        this.apelido = apelido;
        this.data = dataDeNascimento;
    }

    public CustomException validarData() throws CustomException
    {
        if (data.after(new GregorianCalendar().getTime()))
        {
            throw new CustomException("Data de Nascimento Inválida");
        }
        return null;
    }

    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEmailPessoal() {
        return emailPessoal;
    }
    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDataFormated(Calendar data) {
        return data.get(Calendar.DAY_OF_MONTH) 
        + "/" + data.get(Calendar.MONTH) 
        + "/" + data.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return super.toString() 
        + "Apelido: " 
        + this.apelido
        + "\nData de nascimento: "
        + getDataFormated(data);
    }
}

