package Bloco4.Exerc16;

import java.util.Set;
import java.util.TreeSet;

public class OrdemAlfabetica {
    public static void main (String[] args){
        Set<String> nomes = new TreeSet<>();
        nomes.add("Giullia");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Julia");
        nomes.add("Carla");

        System.out.println("Nomes ordenados: " + nomes);



    }
}
