package Bloco3.Exerc3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int escolhaMenu = 0;
		Scanner leitor = new Scanner(System.in);
		LinkedList<String> listaAtendimento = new LinkedList<>();
		
		do {
			System.out.println("[1] - adiciconar atendimento (normal)");
			System.out.println("[2] - adiciconar atendimento (prioritario)");
			System.out.println("[3] - atender atendimento");
			System.out.println("[4] - listar atendimentos");
			System.out.println("[5] - encerrar");
			escolhaMenu = Integer.parseInt(leitor.nextLine());	
			
			switch(escolhaMenu) {
			case 1:
				System.out.print("Digite o nome da pessoa a ser atendida: ");
				listaAtendimento.addLast(leitor.nextLine());
				break;
			case 2:
				System.out.print("Digite o nome da pessoa a ser atendida com prioridade: ");
				listaAtendimento.addFirst(leitor.nextLine());
				break;
			case 3:
				System.out.print("Digite o N° do atendimento a ser resolvido: ");
				listaAtendimento.remove(Integer.parseInt(leitor.nextLine()) - 1);
				break;
			case 4:
				System.out.println("Atendimentos por ordem de prioridade:");
				for(int i=0; i<listaAtendimento.size();i++) {
					System.out.println("%d° - %s".formatted(i+1, listaAtendimento.get(i)));
				}
				System.out.println("\n\n");
				break;
			case 5:
				System.out.print("Encerrando programa");
				break;
			default:
				System.out.print("numero invalido");
				break;
			}
			
			
		}while(escolhaMenu !=5);
	}
}
