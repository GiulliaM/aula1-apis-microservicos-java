package ativ;

import java.util.ArrayList;

public class CadastroPessoas {
	int qtdAtual;
	ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	
	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	void cadastraPessoa(Pessoa pessoa){
		this.getListaPessoas().add(pessoa);
		this.qtdAtual++;//adiciona uma pessoa
	}
	
	void imprimeCadastro() {
		for(int i = 0; i<this.listaPessoas.size();i++) {
			this.listaPessoas.get(i).imprimeDados();
			System.out.print("\n\n");
		
		}
		
	}
}
