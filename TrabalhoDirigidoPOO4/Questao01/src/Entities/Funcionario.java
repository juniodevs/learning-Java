import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Objects;

public class Funcionario {
	String Cpf;
	String Nome;
	char Sexo;
	double Salario;
	GregorianCalendar Nascimento;
	GregorianCalendar Admissao;

	public Funcionario() {
		Admissao = new GregorianCalendar();
	}
	
	public Funcionario (String cpf, String nome, GregorianCalendar adimissao) {
		Cpf = cpf;
		Nome = nome;
		Admissao = adimissao;
	}
	
	public Funcionario (String cpf, String nome, float salario, char sexo, GregorianCalendar admissao, GregorianCalendar nascimento) {
		Cpf = cpf;
		Nome = nome;
		Salario = salario;
		Sexo = sexo;
		Admissao = admissao;
		Nascimento = nascimento;
	}

	public String getCpf() {
		return Cpf;
	}

	public String getNome() {
		return Nome;
	}

	public char getSexo() {
		return Sexo;
	}
	public GregorianCalendar getNascimento() {
		return Nascimento;
	}
	public GregorianCalendar getAdmissao() {
		return Admissao;
	}
	
	public boolean VerificiarCPF () {	
		if(Cpf.length() >= 14)
			return true;
		else
			return false;
	}
	
	public boolean VerificarDataDeNascimento () {	
		if(Nascimento.get(Calendar.YEAR) > 1920)
			return true;
		else
			return false;
	}
		
	public boolean VerificarAdmissao () {
		if(Admissao.get(Calendar.YEAR) > 1995)
			return true;
		else
			return false;
	}
	
	public static Integer getIdade(GregorianCalendar data) {
		Calendar DataSistema = Calendar.getInstance();
		int mes = DataSistema.get(Calendar.MONTH) - data.get(Calendar.MONTH);
		int dia = DataSistema.get(Calendar.DAY_OF_MONTH) - data.get(Calendar.DAY_OF_MONTH);
		int idade = (DataSistema.get(Calendar.YEAR) - data.get(Calendar.YEAR));
		
		if(mes < 0 || (mes == 0 && dia < 0))
			idade--;

		return idade;
	}
	
	public float SalarioLiquido() {
		float salario_liquido;
		
		if(Salario <=3000)
			salario_liquido = (float) (Salario- (0.17*Salario));
		else
			salario_liquido = (float) (Salario - (0.27*Salario));
		
		return salario_liquido;
	}

	public double getBonificacao() {
		double salarioComBonificacao = (2 / 100) * 12 * SalarioLiquido();
		return salarioComBonificacao;
	}

	public GregorianCalendar dataDeAposentadoria() {
		int anoDaAdmissao = Nascimento.get(Calendar.YEAR);
		int mesDaAdmissao = Nascimento.get(Calendar.MONTH);
		int diaDaAdmissao = Nascimento.get(Calendar.DAY_OF_MONTH);

		if (getSexo() == 'M')
			anoDaAdmissao += 35;
		else if (getSexo() == 'F')
			anoDaAdmissao += 30;
		GregorianCalendar aposentados = new GregorianCalendar(anoDaAdmissao, mesDaAdmissao, diaDaAdmissao);
		return aposentados;
	}
	public String toString () {
		return "Nome: " 
        + Nome 
        + "\nCpf: " 
        + Cpf + "\nSalario: R$" 
        + Salario 
        + "\nSexo: " 
        + Sexo
        + "\nData de Nascimento: "
		+ Nascimento.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + Nascimento.get(Calendar.MONTH) 
        + "/" 
        + Nascimento.get(Calendar.YEAR) 
		+ "\nData de Admissão: " 
        + Admissao.get(Calendar.DAY_OF_MONTH) 
        + "/" 
        + Admissao.get(Calendar.MONTH) 
        + "/" 
        + Admissao.get(Calendar.YEAR);
	}
	
	@Override
	public boolean equals (Object objeto) {
		if (this == objeto)
			return true;
		if (getClass()!= objeto.getClass())
			return false;
		
		Funcionario outro = (Funcionario) objeto;
		return Objects.equals(Cpf, outro.Cpf) && Objects.equals(Nome, outro.Nome) && Sexo == outro.Sexo;
	}
}

