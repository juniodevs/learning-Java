package Entities;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Objects;

public class PessoaFisica extends Pessoa {
    private String Cpf;
    private GregorianCalendar DatadeNascimento;

    public PessoaFisica()
    {
    }
    public PessoaFisica(String nome, String cpf, GregorianCalendar datadeNascimento)
    {
        super(nome);
        Cpf = cpf;
        DatadeNascimento = datadeNascimento;
    }

    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public GregorianCalendar getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(GregorianCalendar datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }
	@Override
	public boolean equals(Object obj) {
		PessoaFisica outros = (PessoaFisica) obj;
		return Objects.equals(Cpf, outros.Cpf);
	}
    @Override
    public int CalcularIdade() {
        GregorianCalendar dataDeHoje = (GregorianCalendar) Calendar.getInstance();
		int DiaAtual = dataDeHoje.get(Calendar.DAY_OF_MONTH);
        int MesAtual = dataDeHoje.get(Calendar.MONTH);
        int AnoAtual = dataDeHoje.get(Calendar.YEAR);
        int DiaDoAniversariio = DatadeNascimento.get(Calendar.DAY_OF_MONTH);
		int MesDoAniversario = DatadeNascimento.get(Calendar.MONTH);
        int AnoDoAniversario = DatadeNascimento.get(Calendar.YEAR);
		int age = AnoAtual - AnoDoAniversario;
		if (MesAtual < MesDoAniversario)
			age--;
		if (MesAtual == MesDoAniversario && DiaAtual < DiaDoAniversariio)
			age--;
		return age;
    }

    @Override
    public boolean ValidarDocumento() {
        if (Cpf.length() == 14)
        return true;
        else
        return false;
    }
    @Override
    public String toString()
    {
        return "Pessoa Juridica: " 
        + "\nNome: " 
        + getNome() 
        + "\nCNPJ: " 
        + getCpf() 
        + "\nData de criação: " 
        + DatadeNascimento.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + DatadeNascimento.get(Calendar.MONTH) 
        + "/" 
        + DatadeNascimento.get(Calendar.YEAR)
        + "\nDocumento é valido?: " 
        + ValidarDocumento()
        + "\nIdade: " 
        + CalcularIdade();
    }

}
