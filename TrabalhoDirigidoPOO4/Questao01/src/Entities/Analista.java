import java.util.Arrays;
import java.util.GregorianCalendar;

public class Analista extends Funcionario {
	private String[] Diagram;

	public String[] getDiagram() {
		return Diagram;
	}

	public void setDiagrama(String[] diagram) {
		Diagram = diagram;
	}

	public Analista() {
		super();
		this.Diagram = new String[5];
	}

	public Analista(String cpf, String nome, float salario, char sexo, GregorianCalendar admissao, GregorianCalendar nascimento, String[] Diagram) {
		super(cpf, nome, salario, sexo, admissao, nascimento);
		this.Diagram = Diagram;
	}

	public boolean capacidadeEmLinguagens(Analista analista) {
		boolean Iguais = true;
		if (this.Diagram.length != analista.getDiagram().length)
			return false;

		for (int i = 0; i < Diagram.length; i++) {
			Iguais = Iguais && (this.getDiagram()[i] == analista.getDiagram()[i]);
		}

		return Iguais;
	}

	@Override
	public double getBonificacao() {
		double salarioComBonificacao = (3 / 100) * 12 * SalarioLiquido();
		return salarioComBonificacao;
	}

	@Override
	public String toString() {
		return "Programador\n" 
		+ " Diagrama: " 
		+ Arrays.toString(Diagram) 
		+ "\nCPF: " 
		+ getCpf() 
		+ "\nNome: " 
		+ getNome()
		+ "\nSexo: " 
		+ getSexo() 
		+ "\nSalario Bruto: " 
		+ SalarioLiquido() 
		+ "\nData De Nascimento: "
		+ getNascimento() 
		+ "\nData De Admicao: " 
		+ getAdmissao();
	}
}
