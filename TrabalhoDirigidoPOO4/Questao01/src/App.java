import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.DateFormat;


public class App {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;
			
		System.out.print("Quantos Funcionários tem na sua Empresao?: ");
		N = scanner.nextInt();
			
		Funcionario[] funcionarios = new Funcionario[N];
			
		for(int i=0; i< funcionarios.length; i++) {
			funcionarios[i] = new Funcionario();
			funcionarios[i].Admissao = new GregorianCalendar();
			funcionarios[i].Nascimento = new GregorianCalendar();
		}
		for(int i=0; i< funcionarios.length; i++) {
			System.out.printf("Digite os dados do Funcionário:%2d\n", (i+1));
			System.out.print("Nome: ");
			funcionarios[i].Nome = scanner.next();
            String ANTIBUG = scanner.nextLine();
            System.out.print("CPF: ");
			funcionarios[i].Cpf = scanner.nextLine();
			System.out.print("Sexo(M/F): ");
			funcionarios[i].Sexo = scanner.next().charAt(0);
			System.out.println("Data de Nascimento");
            System.out.print("Dia: ");
			int dia = scanner.nextInt();
            System.out.print("Mes: ");
			int mes = scanner.nextInt();
            System.out.print("Ano: ");
		    int ano = scanner.nextInt();
			funcionarios[i].Nascimento.set(ano, mes-1, dia);
			System.out.println("Data de Admissao: ");
            System.out.print("Dia: ");
			int diaOther = scanner.nextInt();
            System.out.print("Mes: ");
			int mesOther = scanner.nextInt();
            System.out.print("Ano: ");
			int anoOther = scanner.nextInt();
			funcionarios[i].Admissao.set(anoOther, mesOther-1, diaOther);
			System.out.print("Salário bruto: ");
			funcionarios[i].Salario = scanner.nextDouble();
		}
			
		for(int i=0; i< funcionarios.length; i++) {
			System.out.printf("FUNCIONARIO: %2d", (i+1));
			System.out.println(funcionarios[i].toString());
		}
		
		System.out.println("INFOS\n");
        OperacaoFuncionario.Genero(funcionarios);
        OperacaoFuncionario.ValoresDePagamento(funcionarios);
		OperacaoFuncionario.ValidarDados(funcionarios);
		OperacaoFuncionario.SistemaDeIdades(funcionarios);
		
		for(int i=0; i< funcionarios.length; i++) {
			for(int j= i + 1; j< funcionarios.length; j++) {
				if(funcionarios[i].equals(funcionarios[j])) {
					System.out.println("O Funcionário " 
                    + (i+1) 
                    + " e " 
                    + (j+1) 
                    + " tem os mesmos dados");
				}
			}
		}
        scanner.close();
	}
}