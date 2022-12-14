package models;

import java.util.Calendar;

import interfaces.ComunicacaoEmail;
import interfaces.ComunicacaoTelefone;

public class Contato implements ComunicacaoTelefone, ComunicacaoEmail{
    private String nome;
    private String telefone;
    private String observacoes;
    private String email;
    private Calendar data;

    public Contato(String nome, String telefone, String observacoes, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.observacoes = observacoes;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public void enviarEmail(String email, String mensagem) { // Envia um email
        System.out.println("Enviando email para " + email + " com a mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!");
    }
    @Override
    public void ligar(String telefone) { // Faz uma ligação
        System.out.println("Ligando para " + telefone);
        System.out.println("Ligação realizada com sucesso!");
    }
    @Override
    public void enviarSMS(String telefone, String sms) { // Envia um SMS
        System.out.println("Enviando SMS para " + telefone + " com a mensagem: " + sms);
        System.out.println("Mensagem enviada com sucesso!"); 
    }

    @Override
    public String toString() { // Retorna uma string com os dados do contato
        return "Contato:\n" 
        + "Nome:" + nome 
        + "\nTelefone:" 
        + telefone 
        + "\nObservações:" 
        + observacoes 
        + "\nEmail:" 
        + email 
        + "\n";
    }
}

