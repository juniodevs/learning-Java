package Entities;

import java.util.Calendar;

public class ContatoPessoal extends Contato  {
    private String Apelido; // Apelido de contato Pessoal


    public ContatoPessoal()
    {}

    public ContatoPessoal(String nome, String telefone, String observacoes, Calendar dataNascimento, String apelido)
    {
    super(nome, telefone, observacoes, dataNascimento);
    Apelido = apelido;
    }

}
