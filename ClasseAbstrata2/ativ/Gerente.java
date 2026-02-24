package ativ;
public class Gerente extends Funcionario {
	String area;
	
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	void imprimeDados() {
		super.imprimeDados();
		//chamando o metodo na claasse pai (funcionario)
		System.out.println("area: %s".formatted(this.getArea()));
	}
	
	float calculaImposto() {
		//imposto do salario e de 5%
		float imposto;
		imposto = (this.getSalario() / 100) * 5;
		return imposto;
	}
}
