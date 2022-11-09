import java.util.Objects;

public class OperacaoFuncionario extends Funcionario {

	public static void ValidarDados (Funcionario [] Array) {
		for(int i=0; i< Array.length; i++) {
			if(Array[i].VerificiarCPF() == true) {
				System.out.printf("O funcionario: "
                + Array[i].Nome 
                + " teve o cpf válidado.\n");
			}
			else if (Array[i].VerificiarCPF() == false) {
				System.out.printf("O funcionario: " 
                + Array[i].Nome 
                + " teve o cpf inválidado.\n");	
			}
			
			if(Array[i].VerificarDataDeNascimento() == true) {
				System.out.printf("O funcionario: " 
                + Array[i].Nome 
                + " teve a data de Nascimento válidada.\n");
			}
			else if(Array[i].VerificarDataDeNascimento() == false) {
				System.out.printf("O funcionario: " 
                + Array[i].Nome 
                + " teve a data de Nascimento inválidada.\n");
			}
			
			if(Array[i].VerificarAdmissao () == true) {
				System.out.printf("O funcionario: " 
                + Array[i].Nome 
                + " teve a data de admissao válidado.\n");
			}
			else if(Array[i].VerificarAdmissao () == false) {
				System.out.printf("O funcionario: " 
                + Array[i].Nome 
                + " teve a data de admissao inválidada.\n");
			}
		}
	}

	public static void Genero (Funcionario [] Array) {
		int ContagemMasculino=0, ContagemFeminino=0;
		for(int i=0; i< Array.length; i++) {
			if(Objects.equals(Array[i].Sexo, 'M') || Objects.equals(Array[i].Sexo, 'm'))
				ContagemMasculino++;
			if(Objects.equals(Array[i].Sexo, 'F') || Objects.equals(Array[i].Sexo, 'f'))
				ContagemFeminino++;
		}
		
		System.out.println("Na Empresa contêm " 
        + ContagemMasculino 
        + " Homens e " 
        + ContagemFeminino 
        + " Mulheres.");
	}

    static void ValoresDePagamento (Funcionario [] Array) {
		float maiorSalario= -100000, menorSalario= 100000;
		String EmpregadoComMaiorSalario = null, EmpregadoComMenorSalario = null;
		
		for(int i=0; i< Array.length; i++) {
			
			if(Array[i].SalarioLiquido() > maiorSalario) {
				maiorSalario = Array[i].SalarioLiquido();
				EmpregadoComMaiorSalario = Array[i].Nome;
			}
			
			if (Array[i].SalarioLiquido() < menorSalario) {
				menorSalario = Array[i].SalarioLiquido();
				EmpregadoComMenorSalario = Array[i].Nome;
			}
		}
		System.out.printf("O Funcionário com maior salário é: " 
        + EmpregadoComMaiorSalario 
        + " e recebe  R$: " 
        + maiorSalario
        + " reais\n"
        + "e o Funcionario com menor salario é: " 
        + EmpregadoComMenorSalario 
        + " recebendo R$: " 
        + menorSalario 
        + " reais.\n");
	}
	
	static void SistemaDeIdades (Funcionario [] Array) {
		int maiorIdade = -10000, menorIdade= 100000;
		String FuncionarioMaisVelho = null , FuncionarioMaisNovo = null;
		
		for(int i=0; i< Array.length; i++) {
			
			if(Funcionario.getIdade (Array[i].Nascimento) > maiorIdade) {
				maiorIdade = Funcionario.getIdade (Array[i].Nascimento);
				FuncionarioMaisVelho = Array[i].Nome;
			}
			
			if (Funcionario.getIdade (Array[i].Nascimento) < menorIdade) {
				menorIdade = Funcionario.getIdade (Array[i].Nascimento);
				FuncionarioMaisNovo = Array[i].Nome;
			}
		}
		
		System.out.printf("O Funcionário mais velho é: " 
        + FuncionarioMaisVelho 
        + " e tem " 
        + maiorIdade 
        + " anos, e o mais novo é " 
        + FuncionarioMaisNovo 
        + " e tem " 
        + menorIdade 
        + " anos.\n");
	}
}

