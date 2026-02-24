package Bloco1.Exerc3;

import java.util.Scanner;
import java.util.Random;

public class exer3 {
	public static void main(String[] args) {
		System.out.println("== Jogo de Adivinhar o Número! ==");

		Scanner leitor = new Scanner(System.in);
		Random geradorDeNumero = new Random();

		int numeroSecreto = geradorDeNumero.nextInt(100) + 1;
		int proposta = 0;

		while (proposta != numeroSecreto) {
			System.out.print("Digite um número: ");
			proposta = leitor.nextInt();

			if (proposta < numeroSecreto) {
				System.out.println("Muito baixo!");
			} else if (proposta > numeroSecreto) {
				System.out.println("Muito alto!");
			} else {
				System.out.println("🎉 Parabéns! Você acertou!");
			}
		}

		leitor.close();
	}
}