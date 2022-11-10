package Entities;

import Entities.Interface.Colecao;

public class ColecaoPessoa implements Colecao {

    private Pessoa[] Dados;
    private int PosicaoCorrente;

    public ColecaoPessoa(Pessoa[] dados)
    {
        Dados = dados;
    }
    public ColecaoPessoa(Pessoa[] dados, int posicaoCorrente)
    {
        Dados = dados;
        PosicaoCorrente = posicaoCorrente;
    }


    @Override
    public boolean Inserir(Pessoa p) {
        try {
			Pessoa[] pessoa = new Pessoa[Dados.length + 1];
		    for (int i = 0; i < Dados.length; i++) {
		    	pessoa[i] = Dados[i];
		    }
		    pessoa[Dados.length] = p;
		    Dados = pessoa;
		    return true;
		}
		catch (Exception exception) {
			return false;
		}
    }

    @Override
    public boolean Remover() {
                try {
			Pessoa[] pessoa = new Pessoa[Dados.length - 1];
		    for (int i = 0, k = 0; i < Dados.length; i++) {
		    	if (i != PosicaoCorrente) {
		    		pessoa[k] = Dados[i];
		    		k++;
		    	}
		    }
		    Dados = pessoa;
		    return true;
		}
		catch (Exception exception) {
			return false;
		}
    }

    @Override
    public boolean Remover(int i) {
        int k = 0;
        try {
			Pessoa[] pessoa = new Pessoa[Dados.length - 1];
		    for (i = 0, k = 0; i < Dados.length; i++) {
		    	if (i != PosicaoCorrente) {
		    		pessoa[k] = Dados[i];
		    		k++;
		    	}
		    }
		    Dados = pessoa;
		    return true;
		}
		catch (Exception exception) {
			return false;
		}
    }

    @Override
    public void Atualizar(int i, Pessoa pessoa) {
        try {
			Dados[i] = pessoa;
			System.out.println("Dados atualizados!\n" + pessoa + "\n");
		}
		catch (Exception exception) {
			System.out.println("Aconteceu Algum Erro ao Atualizar os Dados");
		}
        
    }

    @Override
    public boolean Pesquisar(Pessoa p) {
        boolean Encontrado = false;
		
		for(Pessoa x : Dados){
		    if(x == p){
		        Encontrado = true;
		        break;
		    }
		}
		return Encontrado;
    }

    @Override
    public boolean ColecaoEstaVazia() {
        if (Dados.length == 0)
        return true;
        else
        return false;
    }

    @Override
    public void ImprimirDadosColecao() {
        for (Pessoa pessoa: Dados) {
			System.out.println(pessoa + "\n");
		}
    }

    @Override
    public Pessoa retornarObjeto(int i) {
        return this.Dados[i];
    }
}
