package Bloco1;

import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		System.out.print("Tabuada com for\n\nDigite um numero para ver a tabuada: ");
		
		Scanner leitor = new Scanner(System.in);
		int num = Integer.parseInt(leitor.nextLine());
		//le a entrada no console, tranforma em numero com o prse int e depois quarda na variavel num
		
		System.out.print("Tabuada do %d:\n".formatted(num));
		for(int i = 1; i < 11;i++) {
			System.out.print("%d, ".formatted(num*i));
		}
		
	}

}
