package Bloco6.Exerc25;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PilhaLivros {
    public static void  main (String[] args){
        Deque<String> pilhaLivros = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilha de Livros \n");

        for (int i = 1; i <= 3; i++){
            System.out.println("Digite o nome do " + i + " livro para empilhar");
            String livro = scanner.nextLine();
            pilhaLivros.push(livro);
        }

        if (!pilhaLivros.isEmpty()) {
            String removido = pilhaLivros.pop();
            System.out.println("Removendo o livro do topo: " + removido);
        }

        if (!pilhaLivros.isEmpty()) {
            String topo = pilhaLivros.peek();
            System.out.println("O novo livro no topo agora é: " + topo);
        }

        System.out.println("\nConfiguração final da pilha: " + pilhaLivros);

        scanner.close();
    }
}
