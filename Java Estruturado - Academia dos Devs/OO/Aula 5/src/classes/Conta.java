package classes;

public class Conta {
    private double saldo;

    public void setDepositar (double valor)
    {
        if (valor < 0){
            System.out.println("Não pode depositar Negativo");
        }
        else
        saldo = saldo + valor;
    }

    public double getSaldo()
    {
        return saldo;
    }
}
