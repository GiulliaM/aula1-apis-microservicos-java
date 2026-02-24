package Bloco5.Exerc22;

import java.util.TreeMap;

public class NotasOrdenada {
    public static void main (String[] args){
        TreeMap<String, Double> notas = new TreeMap<>();
        notas.put("Zara", 8.5);
        notas.put("Giullia", 10.0);
        notas.put("Maria", 10.0);
        notas.put("Beatriz", 6.7);

        System.out.println("Listagem de nota dos alunos: " + notas);

    }
}
