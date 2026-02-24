package Bloco3.Exerc12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String busca;
		ArrayList<String> listaCidades = new ArrayList<>(List.of(
				"sao paulo", 
				"rio de janeiro",
				"belo horizonte",
				"recife",
				"salvador"));
		System.out.println("Digite uma cidade para buscar na lista: ");
		busca = leitor.nextLine();
		if (listaCidades.contains(busca)) {
			System.out.println("a cidade pesquisada existe na lista e esta no indice %d".formatted(listaCidades.indexOf(busca)));
		}else {
			System.out.println("a cidade pesquisada nao existe na lista");
		}
		
		
	}
}
