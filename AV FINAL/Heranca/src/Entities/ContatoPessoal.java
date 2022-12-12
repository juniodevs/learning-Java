package Entities;

import java.util.Calendar;

public class ContatoPessoal extends Contato {
    private String apelido;
    private Calendar dataNascimento;

    public ContatoPessoal(String nome, String telefone, String email ,String apelido, Calendar dataNascimento) {
        super(nome, telefone, email);
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() { // Método toString da classe ContatoPessoal
        return super.toString() // Chama o método toString da classe Contato
        + "\nApelido: " 
        + apelido 
        + "\nData de Nascimento: " 
        + dataNascimento.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + dataNascimento.get(Calendar.MONTH) 
        + "/" 
        + dataNascimento.get(Calendar.YEAR);
    }
}
