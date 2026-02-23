package Bloco5.Exerc2;

import java.util.HashMap;


public class FrequenciaDasPalavras {
    public static void main (String[] args){
        String paragrafo = "Atividades em java para revisão da matéria de API's E MICROSSERVIÇOS para a aula 1 de revisão de java";
        String[] words = paragrafo.split(" ");
        HashMap<String, Integer> frequencia = new HashMap<>();

        for (String p : words) {
            frequencia.put(p, frequencia.getOrDefault(p, 0) + 1);
        }

        frequencia.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
