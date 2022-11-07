
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import Expections.DominiExpection;

/**
 * Funcionario
 */
public class Funcionario {

    private String Cpf;
    private String Nome;
    private char Sexo;
    private double SalarioBruto;
    private GregorianCalendar DataDeNascimento;
    private GregorianCalendar DataDeAdmissao;

    public Funcionario()
    {
        DataDeAdmissao.setTimeZone(TimeZone.getTimeZone("UTC"));

    }
    public Funcionario(String cpf, String nome, GregorianCalendar datadeAdimissao)
    {
        Cpf = cpf;
        Nome = nome;
        DataDeAdmissao = datadeAdimissao;
    }
    public Funcionario(String cpf, String nome, char sexo, double salario, GregorianCalendar datadeAdimissao, GregorianCalendar dataDeNascimento)
    {
        Cpf = cpf;
        Nome = nome;
        Sexo = sexo;
        SalarioBruto = salario;
        DataDeAdmissao = datadeAdimissao;
        DataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    public double getSalarioBruto() {
        return SalarioBruto;
    }
    public void setSalarioBruto(double SalarioBruto) {
        this.SalarioBruto = SalarioBruto;
    }
    public GregorianCalendar getDataDeNascimento() {
        return DataDeNascimento;
    }
    public void setDataDeNascimento(GregorianCalendar DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }
    public GregorianCalendar getDataDeAdmissao() {
        return DataDeAdmissao;
    }
    public void setDataDeAdmissao(GregorianCalendar DataDeAdmissao) {
        this.DataDeAdmissao = DataDeAdmissao;
    }

    //Método de validar CPF
    public void validarCPF(String CPF) throws DominiExpection
    {
        if(CPF.length() < 14)
        {
            Cpf = CPF;
        }
        else
        {
            throw new DominiExpection("Error!, CPF precisa ser maior que 14 Caracteres");
        }
    }

    //Método validar Data de Nascimento
    public void validarDatadeNascimento(GregorianCalendar datanascimento) throws DominiExpection
    {

        int year = datanascimento.YEAR;
        if(year < 1920)
        {
            DataDeNascimento = datanascimento;
        }
        else
        {
            throw new DominiExpection("Error!, Ninguém nasceu antes de 1920");
        }
    }
    //Método validar Data de Adimissão
    public void validarDatadeAdmissao(GregorianCalendar dataadimissao) throws DominiExpection
    {
        int year = dataadimissao.YEAR;

        if(year <= 1995 )
        {
            DataDeAdmissao = dataadimissao;
        }
        else
        {
            throw new DominiExpection("Error!, A empresa foi fundada em 1995");
        }
    }

}