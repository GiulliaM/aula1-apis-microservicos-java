package Bloco4.Exerc13;

import java.util.*;

public class RemoverDuplicatas {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>(Arrays.asList(30, 30, 66, 70, 74, 74, 80, 100));
        Set<Integer> semDuplicatas = new HashSet<>(numeros);

        System.out.printf("Lista de array original: " + numeros);
        System.out.println("\nLista de array sem duplicatas: " + semDuplicatas);
    }
}
