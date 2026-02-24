package controller;

import model.Pessoa;

public class CadastroPessoas {
    private Pessoa[] pessoas;
    public int qtdAtual;

    public CadastroPessoas(int capacidade){
        this.pessoas = new Pessoa[capacidade];
        this.qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pess){
        if(qtdAtual < pessoas.length){
            pessoas[qtdAtual] = pess;
            qtdAtual++;
        }else {
            System.out.println("Cadastro de pessoas cheio!");
        }
    }

    public void imprimeCadastro(){
        for(int i = 0; i < qtdAtual; i++ ){
            pessoas[i].imprimeDados();
        }
    }
}
