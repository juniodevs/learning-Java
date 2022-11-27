package Entities;

import java.util.Calendar;

public class ContatoComercial extends Contato {

    private int NumDeFuncionarios; //Quantidade de Funcionarios

    public ContatoComercial()
    {}

    public ContatoComercial(String nome, String telefone, String observacoes, Calendar dataNascimento, int numDeFuncionarios)
    {
        super(nome, telefone, observacoes, dataNascimento);
        NumDeFuncionarios = numDeFuncionarios;
    }
}
