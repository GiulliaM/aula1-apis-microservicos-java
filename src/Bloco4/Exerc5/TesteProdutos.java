package Bloco4.Exerc5;

import java.util.Set;
import java.util.TreeSet;

public class TesteProdutos {
    public static void main (String[] args){
        Set<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("Mouse", 85.50));
        produtos.add(new Produto("Monitor", 1200.00));
        produtos.add(new Produto("Teclado", 150.00));
        produtos.add(new Produto("Suporte", 45.00));

        System.out.println("--- Lista de Produtos Ordenada pelo Preço ---");
        for (Produto p : produtos) {
            System.out.println(p);
    }
    }
}

