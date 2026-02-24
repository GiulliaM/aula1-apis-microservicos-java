package LanchoneteQuaseTresLanches;

import java.util.ArrayList;

public class Pedido{
	private String nomeCliente;
	private ArrayList<Item> listaItens = new ArrayList<>();
	private double taxaServico;//taxa de entrega
	
	public Pedido(String nomeCli, ArrayList<Item> listaItens, double taxaServico) {
		this.setNomeCliente(nomeCli);
		this.setListaItens(listaItens);
		this.setTaxaServico(taxaServico);
	}
	
	public String gerarNotaFiscal() {
		String nota="========Pedido======\n\n";
		
		for(int i = 0; i< this.listaItens.size();i++) {
			//tipo do item
			nota += "%s\n".formatted(this.getListaItens().get(i).getClass().getSimpleName());
			
			//se for salgadinho o calculo do preco é diferente
			if(this.getListaItens().get(i) instanceof Salgadinho) {
				Salgadinho salgado = (Salgadinho) this.getListaItens().get(i); 
				//convertendo o item atual em salgadinho e guardando as informacoes no novo objeto "salgado"
				
				//calcula o preco x qtd
				nota += "	%d x R$%.2f = R$%.2f\n".formatted(salgado.getQtd(), salgado.getPrecoVenda(), salgado.getPrecoVendaTotal());
			}else {
				nota += "	%.2f\n".formatted(this.getListaItens().get(i).getPrecoVenda());
			}
			
			nota += "\n--------------------\n";
		    nota += "Total: R$%.2f\n".formatted(this.calculaValorTotal());
			
		}
		return nota;
		
	}
	
	public double calculaValorTotal() {
		double precoTotal=0;
		for(int i = 0; i< this.listaItens.size();i++) {
			if(this.getListaItens().get(i) instanceof Salgadinho) {
				Salgadinho salgado = (Salgadinho) this.getListaItens().get(i); 
				//convertendo o item atual em salgadinho e guardando as informacoes no novo objeto "salgado"
				
				//calcula o preco x qtd
				precoTotal += salgado.getQtd() * salgado.getPrecoVenda();
			}else {
				precoTotal += this.getListaItens().get(i).getPrecoVenda();
			}
		}
		return precoTotal;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getListaItens() {
		return listaItens;
	}

	public void setListaItens(ArrayList<Item> listaItens) {
		this.listaItens = listaItens;
	}

	public double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}
	
	
	
}
