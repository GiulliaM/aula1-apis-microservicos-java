package LanchoneteQuaseTresLanches;

public class Lanche extends Item{
	String tipoPao;
	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	String recheio;
	String molho;
	
	public Lanche(double precoVenda, String dataValidade, double peso,String tipoPao, String recheio, String molho) {
		super(precoVenda, dataValidade, peso);
		this.setTipoPao(tipoPao);
		this.setRecheio(recheio);
		this.setMolho(molho);
	}
}


