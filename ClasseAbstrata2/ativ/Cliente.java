package ativ;
public class Cliente extends Pessoa {
	int codigo;
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	void imprimeDados() {
		System.out.println("Codigo: %d".formatted(this.getCodigo()));
		System.out.println("Nome: %s".formatted(this.getNome()));
		
	}

}
