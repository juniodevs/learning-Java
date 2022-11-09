package Entities;

import Entities.Interface.Colecao;

public class ColecaoPessoa implements Colecao {

    public Pessoa dados;
    public int PosicaoCorrente;

    
    public ColecaoPessoa()
    {}


    @Override
    public boolean Inserir(Pessoa p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean Remover() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean Remover(int i) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void Atualizar(int i, Pessoa p) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean Pesquisar(Pessoa p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean ColecaoEstaVazia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ImprimirDadosColecao() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Pessoa retornarObjeto(int i) {
        // TODO Auto-generated method stub
        return null;
    }


}
