package Entities;

public class PessoaFisica {
    private String nome; //Atributo nome
    private String cpf; //Atributo cpf
    private String rg; //Atributo rg

    public PessoaFisica(String nome, String cpf, String rg) { //Construtor da classe PessoaFisica
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    //Métodos ficarão abaixo
    @Override
    public String toString() { // Com o Método toString, é possível imprimir os objetos criados, sem a necessidade de criar um método para cada um deles.
        return "Nome: " 
        + this.nome 
        + " - CPF: "
        + this.cpf
        + " - RG: "
        + this.rg;
    }
}
