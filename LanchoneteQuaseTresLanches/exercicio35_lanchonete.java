package LanchoneteQuaseTresLanches;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio35_lanchonete {
	public static void main(String[] args) {
		ArrayList<String> arrayAux = new ArrayList<>();
		//para os inputs do usuario
		
		int escolha = 0;
		Scanner leitor = new Scanner(System.in);
		ArrayList<Pedido> listaPedidos = new ArrayList<>();
		
		do {
			System.out.println("[1] - Criar novo pedido");
			System.out.println("[2] - gerar nota fiscal");
			
			escolha = Integer.parseInt(leitor.nextLine());	
			
			switch(escolha) {
			case 1:
				int escolhaItem;
				String nomeCli;
				double taxaServ;
				ArrayList<Item> listaItens = new ArrayList<>();
				
				System.out.println("Criando novo pedido.");
				System.out.println("Digite o nome do cliente");
				nomeCli = leitor.nextLine();
				
				String adicionarItens = "";
				do {
					System.out.println("adicone um item no pedido:");
					
					
					System.out.println("Adicione os itens ao pedido:");
					System.out.println("(1) - pizza");
					System.out.println("(2) - lanche");
					System.out.println("(3) - salgadinhos");
					escolhaItem = Integer.parseInt(leitor.nextLine());
					
					switch(escolhaItem) {
					case 1:
						double precoVenda;
						String dataValidade;
						double peso;
						String recheio;
						String borda;
						String molho;
						//variaveis temp da pizza
						System.out.println("Digite o preco da pizza: ");
						precoVenda = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite a data de validade:");
						dataValidade = leitor.nextLine();
						System.out.println("Digite o peso");
						peso = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite o recheio");
						recheio = leitor.nextLine();
						System.out.println("Digite o tipo de borda");
						borda = leitor.nextLine();
						System.out.println("Digite o molho");
						molho = leitor.nextLine();
						
						//criando a pizza
						Pizza novaPizza = new Pizza(precoVenda, dataValidade, peso, recheio, borda, molho);
						listaItens.addLast(novaPizza);
						break;
					case 2:
						String tipoPao;
						//variaveis temp da pizza
						System.out.println("Digite o preco do lanche: ");
						precoVenda = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite a data de validade:");
						dataValidade = leitor.nextLine();
						System.out.println("Digite o peso");
						peso = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite o tipo de pao");
						tipoPao = leitor.nextLine();
						System.out.println("Digite o recheio");
						recheio = leitor.nextLine();
						System.out.println("Digite o molho");
						molho = leitor.nextLine();
						
						//criando a pizza
						Lanche novoLanche = new Lanche(precoVenda, dataValidade, peso, tipoPao, recheio, molho);
						listaItens.addLast(novoLanche);
						break;
					case 3:
						int i;
						String tipo = "";//assado ou frito
						String massa ="";
						int qtd =0;
						//variaveis temp da pizza
						System.out.println("Digite o preco do salgadinho (UN): ");
						precoVenda = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite a data de validade:");
						dataValidade = leitor.nextLine();
						System.out.println("Digite o peso");
						peso = Float.parseFloat(leitor.nextLine());
						System.out.println("Digite o tipo (1-assado ou 2-frito):");
						i = Integer.parseInt(leitor.nextLine());
						do {
							switch(i) {
							case 1:
								tipo = "assado";
								break;
							case 2:
								tipo = "frito";
								break;
							default:
								System.out.println("opcao invalida");
							}
						}while(i != 1 && i != 2);
						
						
						System.out.println("Digite a massa");
						massa = leitor.nextLine();
						System.out.println("Digite o recheio");
						recheio = leitor.nextLine();
						System.out.println("Quantos salgadinhos deseja no pedido? (UN)");
						qtd = Integer.parseInt(leitor.nextLine());
						
						//criando a pizza
						Salgadinho novoSalgadinho = new Salgadinho(precoVenda, dataValidade, peso, tipo,massa, recheio, qtd);
						listaItens.addLast(novoSalgadinho);
						break;
					}
					System.out.println("gostaria de adiconar mais um irem no pedido? (s/n)");
					adicionarItens = leitor.nextLine();
				}while(adicionarItens.contains("s") || adicionarItens.contains("S"));//s = continuar adicoonando. n = parar de adiconar
				
				//tratando do pagamento
				double valorTotalPedido=0;
				String metodoPagamento;
				int escolhaPagamento=0;
				
				for (int i = 0;i<listaItens.size();i++) {
					//se for salgadinho o calculo do preco é diferente
					if(listaItens.get(i) instanceof Salgadinho) {//se ele for um salgadinho
						Salgadinho salgado = (Salgadinho) listaItens.get(i); 
						//convertendo o item atual em salgadinho e guardando as informacoes no novo objeto "salgado"
						
						//calcula o preco x qtd
						valorTotalPedido += (salgado.getQtd() *salgado.getPrecoVenda());
					}else {
						valorTotalPedido += listaItens.get(i).getPrecoVenda();
					}
				}
				
				
				do {
					System.out.println("Valor total do pedido: R$%f".formatted(valorTotalPedido));
					System.out.println("Selecione o Metodo de Pagamento: ");
					System.out.println("[1] - Pix");
					System.out.println("[2] - Cartao de Credito");
					System.out.println("[3] - Cartao de Debito");
					System.out.println("[4] - Dinheiro");
					escolhaPagamento = Integer.parseInt(leitor.nextLine());					
					switch(escolhaPagamento) {
						case 1:
							System.out.println("Pix selecionado");
							break;
						case 2:
							System.out.println("Cartao de Credito selecionado");
							break;
						case 3:
							System.out.println("Cartao de Debito selecionado");
							break;
						case 4:
							System.out.println("Dinheiro selecionado");
							double valorRecebido=0;
							System.out.println("Valor Recebido: ");
							valorRecebido = Float.parseFloat(leitor.nextLine());
							System.out.println("Troco: R$%.2f".formatted(valorRecebido - valorTotalPedido));
							break;
						default:
							System.out.println("Opcao invalida");
					}
				}while(escolhaPagamento != 1 && escolhaPagamento != 2 && escolhaPagamento != 3 && escolhaPagamento != 4);
				//criando o pedido
				Pedido novoPedido = new Pedido(nomeCli, listaItens, 7.0);
				listaPedidos.addLast(novoPedido);
				System.out.println("pedido do cliente %s criado com sucesso!".formatted(novoPedido.getNomeCliente()));
				
				break;
			case 2: //gerar nota fiscal
				if (listaPedidos.isEmpty()) {
					System.out.println("nenhum pedido feito.");
					
				}else {
					for(int k = 0; k<listaPedidos.size();k++) {
						System.out.println(listaPedidos.get(k).gerarNotaFiscal());
					};
				}

				
			}
			
		}while(escolha !=4);
			
		
		
	}
}





