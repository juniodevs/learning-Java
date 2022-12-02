package models;

import interfaces.ComunicacaoEmail;
import interfaces.ComunicacaoTelefone;

public class Contato implements ComunicacaoTelefone, ComunicacaoEmail{
    private String nome;
    private String telefone;
    private String observacoes;
    private String email;

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

    @Override
    public void enviarEmail(String email, String mensagem) {
        System.out.println("Enviando email para " + email + " com a mensagem: " + mensagem);
    }
    @Override
    public void ligar(String telefone) {
        System.out.println("Ligando para " + telefone);
    }
    @Override
    public void enviarSMS(String telefone, String sms) {
        System.out.println(telefone + " " + sms);
        System.out.println("Mensagem enviada com sucesso!"); 
    }
}

