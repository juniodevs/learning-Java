package Entities.Interface;
import Entities.Pessoa;

public interface Colecao {

    public boolean Inserir(Pessoa p);
    public boolean Remover();
    public boolean Remover(int i);
    public void Atualizar(int i, Pessoa p);
    public boolean Pesquisar(Pessoa p);
    public boolean ColecaoEstaVazia();
    public void ImprimirDadosColecao();
    public Pessoa retornarObjeto(int i);


    
}
