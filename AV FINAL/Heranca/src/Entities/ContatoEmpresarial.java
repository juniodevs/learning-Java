package Entities;

public class ContatoEmpresarial extends Contato {
    private String cnpj;
    private String telefoneFixo;

    public ContatoEmpresarial(String nome, String telefone, String email, String cnpj, String telefoneFixo) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
        this.telefoneFixo = telefoneFixo;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefoneFixo() {
        return telefoneFixo;
    }
    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    @Override
    public String toString() { // Método toString da classe ContatoEmpresarial
        return super.toString() // Chama o método toString da classe Contato
        + "\nCNPJ: " 
        + cnpj 
        + "\nTelefone Fixo: " 
        + telefoneFixo;
    }
}
