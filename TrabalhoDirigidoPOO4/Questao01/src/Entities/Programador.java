import java.util.Arrays;
import java.util.GregorianCalendar;

public class Programador extends Funcionario {
	private String[] Linguagem;

	public String[] getLinguagem() {
		return Linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		Linguagem = linguagem;
	}

	public Programador() {
		super();
		Linguagem = new String[5];
	}

	public Programador(String cpf, String nome, float salario, char sexo, GregorianCalendar admissao, GregorianCalendar nascimento,
			GregorianCalendar dataDeAdmicao, String[] linguagem) {
			super(cpf, nome, salario, sexo, admissao, nascimento);
			Linguagem = linguagem;
	}

	public boolean programaMesmasLinguagens(Programador programador) {
		boolean Iguais = true;
		if (this.Linguagem.length != programador.getLinguagem().length)
			return false;

		for (int i = 0; i < Linguagem.length; i++) {
			Iguais = Iguais && (this.getLinguagem()[i] == programador.getLinguagem()[i]);
		}
		return Iguais;
	}

	@Override
	public String toString() {
		return "Programador\n" 
		+"Linguagem: "
		+ Arrays.toString(Linguagem) 
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
		+ "\nData De Admissão: "
		+ getAdmissao();
	}
}
