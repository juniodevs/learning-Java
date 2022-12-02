package com.mycompany.trabalhofinal.interfaces;

public interface ComunicacaoTelefone {
    public abstract void ligar(int telefone);
    public abstract void enviarSMS(int telefone, String sms);
}
