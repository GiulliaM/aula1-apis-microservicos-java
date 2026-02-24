package ativ;

public abstract class Pessoa {
	//classe abstrata nao sera instanciada
	String Nome;
	Data nascimento;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	abstract void imprimeDados();//metodo abstrato
		//significa que toda classe que extendes essa classe tera que ter esse metodo
	//metodo abstrato so nao sera definido na classe abstrata
		
	
}
