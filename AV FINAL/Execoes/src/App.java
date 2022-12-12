import Entities.Calculadora;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Abrindo o Scanner
        Calculadora calc = new Calculadora(); // Instanciando a classe Calculadora
    try{ // Tentando executar o código
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());
        System.out.println(calc.potencia());
        System.out.println(calc.raizQuadrada());
    }
    catch (java.util.InputMismatchException e) // Caso o usuário digite um valor inválido
    {
        System.out.println("Digite um número válido");
    }
    catch (java.lang.ArithmeticException e) // Caso o usuário tente dividir por zero
    {
        System.out.println("Não é possível dividir por zero");
    }
    catch (Exception e) { // Caso ocorra algum erro inesperado
        System.out.println("Erro inesperado");
    }
    finally { // Fechando o Scanner
        sc.close();
    }
}
}

// Exceptions são erros que ocorrem durante a execução do programa
// O Java possui uma hierarquia de exceções, que é dividida em 3 níveis:
// 1. Checked Exceptions: São erros que podem ser previstos e que devem ser tratados
// 2. Unchecked Exceptions: São erros que não podem ser previstos e que devem ser tratados
// 3. Errors: São erros que não podem ser previstos e que não devem ser tratados
// Try Catch: É uma estrutura de controle que permite tratar erros
// Try: É o bloco de código que pode gerar um erro
// Catch: É o bloco de código que trata o erro
// Finally: É o bloco de código que é executado sempre, mesmo que ocorra um erro
// Throws: É uma palavra-chave que permite que o método lance uma exceção