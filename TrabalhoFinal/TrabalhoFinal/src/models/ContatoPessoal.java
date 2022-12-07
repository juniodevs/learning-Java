package models;

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

    public int getIdade()
    {
        Calendar dataAtual = new GregorianCalendar();
        int idade = dataAtual.get(Calendar.YEAR) - data.get(Calendar.YEAR);
        if (dataAtual.get(Calendar.MONTH) < data.get(Calendar.MONTH))
        {
            idade--;
        }
        else if (dataAtual.get(Calendar.MONTH) == data.get(Calendar.MONTH) && dataAtual.get(Calendar.DAY_OF_MONTH) < data.get(Calendar.DAY_OF_MONTH))
        {
            idade--;
        }
        return idade;
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

    public String getDataFormated(Calendar data) { // Formata a DATA para String
        return data.get(Calendar.DAY_OF_MONTH) 
        + "/" + data.get(Calendar.MONTH) 
        + "/" + data.get(Calendar.YEAR);
    }

    @Override
    public String toString() { // Formata a saída do objeto para String
        return super.toString() 
        + "Apelido: " 
        + this.apelido
        + "\nData de nascimento: "
        + getDataFormated(data);
    }
}

