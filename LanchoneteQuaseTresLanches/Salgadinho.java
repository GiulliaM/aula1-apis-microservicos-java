package LanchoneteQuaseTresLanches;

public class Salgadinho extends Item{
	String tipo; //frito ou assado
	String massa;
	String recheio;
	int qtd;
	

	public double getPrecoVendaTotal() {
		double valorTotal;
		valorTotal = this.getPrecoVenda() * this.getQtd();
		return valorTotal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Salgadinho(double precoVenda, String dataValidade, double peso,String tipo, String massa, String recheio,int qtd) {
		super(precoVenda, dataValidade, peso);
		this.setTipo(tipo);
		this.setMassa(massa);
		this.setRecheio(recheio);
		this.setQtd(qtd);
	}
}