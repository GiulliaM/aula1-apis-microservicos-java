package Bloco3.Exerc10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Random gerador = new Random();
		
		for(int i = 0; i<10;i++) {
			lista.add(i, gerador.nextInt(1, 100));
		}
		
		System.out.println("\nlista desorganizada");
		for(int i = 0; i<lista.size();i++) {
			System.out.print("%d, ".formatted(lista.get(i)));
		}
		
		Collections.sort(lista);
		
		System.out.println("\nlista organizada");
		for(int i = 0; i<lista.size();i++) {
			System.out.print("%d, ".formatted(lista.get(i)));
		}
	}
}
