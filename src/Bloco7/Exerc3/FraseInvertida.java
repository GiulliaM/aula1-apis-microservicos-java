package Bloco7.Exerc3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FraseInvertida {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Deque<String> pilhaFrase = new ArrayDeque<>();

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        for (String palavra : palavras){
            pilhaFrase.push(palavra);
        }

        System.out.println("Frase inverrida: " );

        while (!pilhaFrase.isEmpty()) {
            System.out.println(pilhaFrase.pop() + " ");
        }

        System.out.println("\n\nProcesso concluído!");
        scanner.close();
    }
}
