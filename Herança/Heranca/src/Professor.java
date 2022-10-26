public class Professor extends Pessoa {
    private float salario;

    public Professor(String nome, String cpf,float salario){
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + salario);
    }
}
