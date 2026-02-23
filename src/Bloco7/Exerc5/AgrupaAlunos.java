package Bloco7.Exerc5;

import java.util.*;

public class AgrupaAlunos {
    public static void main (String[] args){
        List<Aluno> listaAlunos = Arrays.asList(
                new Aluno("Giullia", 10.0),
                new Aluno("Maria", 10.0),
                new Aluno("Julia", 5.5),
                new Aluno("Luisa", 7.6),
                new Aluno("Carlos", 4.0),
                new Aluno("Manoel", 6.6),
                new Aluno("Julio", 9.9),
                new Aluno("Katarina", 3.1)
        );

        Map<String, List<Aluno>> grupos = new HashMap<>();

        grupos.put("Aprovados", new ArrayList<>());
        grupos.put("Recuperação", new ArrayList<>());
        grupos.put("Reprovados", new ArrayList<>());

        for (Aluno aluno : listaAlunos){
            if(aluno.nota >= 7){
                grupos.get("Aprovados").add(aluno);
            }else if(aluno.nota >= 5 && aluno.nota < 7){
                grupos.get("Recuperação").add(aluno);
            }else{
                grupos.get("Reprovados").add(aluno);
            }
        }

        System.out.println("Lista final dos alunos");
        for (String chave : grupos.keySet()) {
            System.out.println("\n" + chave + ":");
            for (Aluno a : grupos.get(chave)) {
                System.out.println(a);
            }
        }
    }
}
