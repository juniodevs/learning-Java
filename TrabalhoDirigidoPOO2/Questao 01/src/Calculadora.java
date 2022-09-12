public class Calculadora {

    public double calcular (double N1, double N2, char operacao)
    {
        double retorno = 0;
        switch (operacao) {
            case '+':
            retorno = N1+N2;
            break;

            case '-':
            retorno = N1-N2;
            break;

            case '*':
            retorno = N1*N2;
            break;

            case '/':
            retorno = N1/N2;
            if(N2 == 0 || N1 == 0)
            {
                System.out.println("Divisão não pode ser feita por 0");
            }
            break;
            default:
            break;
        }
            return retorno;
    }
}
