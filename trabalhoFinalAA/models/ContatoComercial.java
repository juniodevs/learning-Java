package com.mycompany.trabalhofinal.models;

import com.mycompany.trabalhofinal.interfaces.ComunicacaoEmail;
import com.mycompany.trabalhofinal.interfaces.ComunicacaoTelefone;
import java.util.Calendar;

public class ContatoComercial extends Contato implements ComunicacaoTelefone,ComunicacaoEmail {
    public String cnpj;
    public String emailEmpresarial;
    public ContatoComercial(String nome, String telefone, String observacoes, Calendar dataNascimento, String email) {
        super(nome, telefone, observacoes, dataNascimento, email);
    }
    @Override
    public void ligar(int telefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarSMS(int telefone, String sms) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarEmail(String email, String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
