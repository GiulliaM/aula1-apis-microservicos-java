package Bloco1;

import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
		System.out.println("Calculadora de media \n\n");
		
		Scanner leitor = new Scanner(System.in);//system.in = input do console
		String nota;
		int[] vetorNotas = new int[3];
		int media = 0;
		
		
		for(int i = 0; i < 3; i++) {
			System.out.print("digite um numero: ");
			nota = leitor.nextLine(); //vai ler o input do teclado no terminal
			vetorNotas[i] = Integer.parseInt(nota);
		}
		
		for(int i = 0; i < 3; i++) {
			media += vetorNotas[i];
		}
		media = media / vetorNotas.length;
		
		
		System.out.print("suas notas foram: %d, %d, %d e sua media e %d".formatted(vetorNotas[0], vetorNotas[1], vetorNotas[2], media));
		
	}
}
