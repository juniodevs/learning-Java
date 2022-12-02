package models;

public class ContatoPessoal extends Contato{
    public String apelido;
    public String emailPessoal;

    public ContatoPessoal(String apelido, String nome, String telefone, String observacoes, String email) {
        super(nome,  telefone, observacoes, email);
        this.apelido = apelido;
    }

    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}

