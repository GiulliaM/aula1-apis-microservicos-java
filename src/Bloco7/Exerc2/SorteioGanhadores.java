package Bloco7.Exerc2;

import java.util.*;

public class SorteioGanhadores {
    public static void main (String[] args){
        List<String> participantes = new ArrayList<>();
        participantes.add("Giullia");
        participantes.add("Ligia");
        participantes.add("Maria");
        participantes.add("Julia");
        participantes.add("Giullia");
        participantes.add("Giullia");
        participantes.add("Marcelo");
        participantes.add("Katarina");

        System.out.println("Lista de participantes do sorteio: " + participantes);

        sorteioParticipantes(participantes);

    }

    public static void sorteioParticipantes(List<String> listaOriginal){
        Set<String> setUnicos = new HashSet<>(listaOriginal);

        List<String> listaSorteio = new ArrayList<>(setUnicos);

        System.out.println("Participantes sem repetição para fazer o sorteio: " + listaSorteio);

        Collections.shuffle(listaSorteio);

        System.out.println("Sorteaando 3 Ganhadores do Sorteio: ");
        int ganhadores = Math.min(3, listaSorteio.size());

        for (int i = 0; i < ganhadores; i++){
            System.out.println((i + 1) + "º Ganhador: " + listaSorteio.get(i));
        }
    }
}
