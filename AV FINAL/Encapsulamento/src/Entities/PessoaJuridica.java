package Entities;



public class PessoaJuridica {
    private String nome;
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, String ie) { //Construtor da classe PessoaJuridica
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //Métodos ficarão abaixo

    @Override
    public String toString() { // Com o Método toString, é possível imprimir os objetos criados, sem a necessidade de criar um método para cada um deles.
        return "Nome: " 
        + this.nome 
        + " - CNPJ: " 
        + this.cnpj;
    }
    
}
