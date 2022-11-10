package Entities;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    public String Cnpj;
    public GregorianCalendar DataCriacao;

    public PessoaJuridica()
    {
    }
    public PessoaJuridica(String nome, String cnpj, GregorianCalendar datacriacao)
    {
        super(nome);
        Cnpj = cnpj;
        DataCriacao = datacriacao;
    }

    public String getCnpj() {
        return Cnpj;
    }
    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }
    public GregorianCalendar getDataCriacao() {
        return DataCriacao;
    }
    public void setDataCriacao(GregorianCalendar dataCriacao) {
        DataCriacao = dataCriacao;
    }
    //
    @Override
    public int CalcularIdade() {
        GregorianCalendar dataDeHoje = (GregorianCalendar) Calendar.getInstance();
		int DiaAtual = dataDeHoje.get(Calendar.DAY_OF_MONTH);
        int MesAtual = dataDeHoje.get(Calendar.MONTH);
        int AnoAtual = dataDeHoje.get(Calendar.YEAR);

        int DiaDoAniversariio = DataCriacao.get(Calendar.DAY_OF_MONTH);
		int MesDoAniversario = DataCriacao.get(Calendar.MONTH);
        int AnoDoAniversario = DataCriacao.get(Calendar.YEAR);
		

		int age = AnoAtual - AnoDoAniversario;
		if (MesAtual < MesDoAniversario)
			age--;
		if (MesAtual == MesDoAniversario && DiaAtual < DiaDoAniversariio)
			age--;
		return age;
    }

    @Override
	public boolean equals(Object obj) {
		PessoaJuridica outros = (PessoaJuridica) obj;
		return Objects.equals(Cnpj, outros.Cnpj);
	}

    @Override
    public boolean ValidarDocumento() {
        if (Cnpj.length() == 18)
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
        + getCnpj() 
        + "\nData de criação: " 
        + DataCriacao.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + DataCriacao.get(Calendar.MONTH) 
        + "/" 
        + DataCriacao.get(Calendar.YEAR)
        + "\nDocumento é valido?: " 
        + ValidarDocumento()
        + "\nIdade: " 
        + CalcularIdade();
    }
}
