package LanchoneteQuaseTresLanches;

public class Item{
	private double precoVenda;
	private String dataValidade;
	private double peso;
	
	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Item(double precoVenda, String dataValidade, double peso) {
		this.setPrecoVenda(precoVenda);
		this.setDataValidade(dataValidade);
		this.setPeso(peso);
	}
}

