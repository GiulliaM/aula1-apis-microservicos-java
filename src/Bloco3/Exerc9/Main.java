package Bloco3.Exerc9;

//importanto a arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> listaDeTarefas = new ArrayList<>();
		//controle de menu
		int escolha = 0;
		int numRemoverTarefa;
		
		do {
			System.out.println("\n\n[1] - adicionar tarefa");
			System.out.println("[2] - remover tarefa (pelo indice)");
			System.out.println("[3] - listar tarefas");
			System.out.println("[4] - encerrar programa");
			escolha = Integer.parseInt(leitor.nextLine());
			
			switch(escolha) {
			case 1:
				System.out.println("Digite a tarefa que gostaria de adicnar: ");
				listaDeTarefas.addLast(leitor.nextLine()); 
				break;
			case 2:
				System.out.print("Digite o numero da tarefa que gostaria de remover: ");
				listaDeTarefas.remove(Integer.parseInt(leitor.nextLine()));
				break;
			case 3:
				System.out.println("Lista de tarefas: ");
				for(int i = 0;i<listaDeTarefas.size(); i++) {
					System.out.println("%d - %s".formatted(i, listaDeTarefas.get(i)));
				}
				break;
			case 4:
				System.out.println("Encerrando programa");
				break;
			default:
				System.out.print("opcao invalida");
				break;
		}
			
			
			
		}while (escolha != 4);
		
		
		
	}
}
