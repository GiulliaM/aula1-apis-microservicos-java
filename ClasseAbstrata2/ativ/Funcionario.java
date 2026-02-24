package ativ;
public class Funcionario extends Pessoa {
	float salario;
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	void imprimeDados() {
		System.out.println("Nome: %s".formatted(this.getNome()));
		System.out.println("Salario: %.2f".formatted(this.getSalario()));
		System.out.println("imposto sobre salario: %.2f".formatted(this.calculaImposto()));
		
	}
	
	float calculaImposto() {
		//imposto do salario e de 3%
		float imposto;
		
		imposto = (this.getSalario() / 100) * 3;
		return imposto;
	}
}
