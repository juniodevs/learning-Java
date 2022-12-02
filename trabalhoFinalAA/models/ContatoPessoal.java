/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal.models;


import com.mycompany.trabalhofinal.interfaces.ComunicacaoEmail;
import com.mycompany.trabalhofinal.interfaces.ComunicacaoTelefone;
import java.util.Calendar;

/**
 *
 * @author Guilherme
 */
public class ContatoPessoal extends Contato implements ComunicacaoTelefone, ComunicacaoEmail{
    public String apelido;
    public String emailPessoal;
    public ContatoPessoal(String apelido, String nome, String telefone, String observacoes, Calendar dataNascimento, String email) {
        super(nome,  telefone, observacoes, dataNascimento, email);
        this.apelido = apelido;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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
