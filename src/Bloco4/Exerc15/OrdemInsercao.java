package Bloco4.Exerc15;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrdemInsercao {
    public static void main(String[] args){
    Set<String> dias = new LinkedHashSet<>();

    dias.add("Terça");
    dias.add("Quinta");
    dias.add("Segunda");
    dias.add("Quarta");
    dias.add("Sexta");

    for (String dia : dias){
        System.out.println(dia);
    }

    }
}
