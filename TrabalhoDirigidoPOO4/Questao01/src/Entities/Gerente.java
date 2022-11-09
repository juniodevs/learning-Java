import java.util.Arrays;
import java.util.GregorianCalendar;

public class Gerente extends Funcionario {
	private String[] MetodoDeDesenvolvimento;

	public String[] getMetodologiaDesenvolvimento() {
		return MetodoDeDesenvolvimento;
	}
	public void setMetodologiaDesenvolvimento(String[] MetodoDeDesenvolvimento) {
		this.MetodoDeDesenvolvimento = MetodoDeDesenvolvimento;
	}
	public Gerente() {
		this.MetodoDeDesenvolvimento = new String[5];
	}
	public Gerente(String cpf, String nome, float salario, char sexo, GregorianCalendar admissao, GregorianCalendar nascimento, String[] MetodoDeDesenvolvimento) {
		super(cpf, nome, salario, sexo, admissao, nascimento);
		this.MetodoDeDesenvolvimento = MetodoDeDesenvolvimento;
	}
	public boolean MesmasMetodologias(Gerente gerente) {
		boolean asMesmas = true;
		if (this.MetodoDeDesenvolvimento.length != gerente.getMetodologiaDesenvolvimento().length){
			return false;
		}
		for (int i = 0; i < MetodoDeDesenvolvimento.length; i++) {
			asMesmas = asMesmas && (this.getMetodologiaDesenvolvimento()[i] == gerente.getMetodologiaDesenvolvimento()[i]);
		}
		return asMesmas;
	}
	
	@Override
	public double getBonificacao() {
		double salarioComBonificacao = (5 / 100) * 12 * SalarioLiquido();
		return salarioComBonificacao;
	}
	
	@Override
	public String toString() {
		return "Programador \nMetodologia de Desenvolvimento = "
		+ Arrays.toString(MetodoDeDesenvolvimento)
		+ "\nCPF = "
		+ getCpf()
		+ "\nNome = " 
		+ getNome()
		+ "\nSexo = " + getSexo()
		+ "\nSalario Bruto = "
		+ SalarioLiquido()
		+ "\nData De Nascimento = "
		+ getNascimento()
		+ "\nData De Admicao = "
		+ getAdmissao();
	}
}
