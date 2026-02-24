package Bloco5.Exerc18;

import java.util.HashMap;
import java.util.Scanner;

public class Dicionario {
    public static void main (String[] args){
        HashMap<String, String> dicionario = new HashMap<>();
        dicionario.put("livro", "book");
        dicionario.put("casa", "house");
        dicionario.put("felicidade", "happiness");
        dicionario.put("trabalho", "work");
        dicionario.put("amizade", "friendship");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra em português: ");
        String palavra = sc.nextLine().toLowerCase();

        if(dicionario.containsKey(palavra)){
            System.out.println("Tradução: " + dicionario.get(palavra));
        }else{
            System.out.println("Palavra não encontrada no dicionário.");
        }
    }
}
