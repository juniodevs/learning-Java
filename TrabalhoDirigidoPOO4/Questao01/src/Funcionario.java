public class Funcionario {
    private String cpf;
    private String nome;
    private char sexo;
    private double salarioBruto;

    public Funcionario(String cpf, String nome, char sexo, double salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    
}