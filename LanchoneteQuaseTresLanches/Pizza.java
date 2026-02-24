package LanchoneteQuaseTresLanches;

public class Pizza extends Item{
	private String recheio;
	private String borda;
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	private String molho;
	
	public Pizza(double precoVenda, String dataValidade, double peso, String recheio, String borda, String molho) {
		//envia para a aclasse pai para criar o Item primeiro
		super(precoVenda, dataValidade, peso);
		this.setRecheio(recheio);
		this.setBorda(borda);
		this.setMolho(molho);
	}
}


