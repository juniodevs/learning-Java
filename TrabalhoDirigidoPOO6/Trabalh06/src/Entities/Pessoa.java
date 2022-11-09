package Entities;

public abstract class Pessoa {
    public String Nome;
    public Pessoa()
    {}
    public Pessoa(String nome)
    {
        Nome = nome;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public String toString()
    {
        return Nome;
    }

    public abstract boolean ValidarDocumento();
    public abstract int CalcularIdade();

}
