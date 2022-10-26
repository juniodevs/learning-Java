public class Pessoa {
    private String nome;
    private String cpf;
    
    //Construtor
    public Pessoa(String nome, String cpf) 
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Método
    public void imprime()
    {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

}
