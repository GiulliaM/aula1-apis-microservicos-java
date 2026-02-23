package Bloco7.Exerc1;

import java.util.List;

public class Main {
    public static void main (String[] args){
        Categorias categorias = new Categorias();

        categorias.adicionarProduto("Eletrônicos", new Produto("iPhone 15", 5999.00));
        categorias.adicionarProduto("Eletrônicos", new Produto("MacBook Air", 8200.00));
        categorias.adicionarProduto("Livros", new Produto("Arquitetura Limpa", 85.00));
        categorias.adicionarProduto("Livros", new Produto("Java: Como Programar", 250.00));
        categorias.adicionarProduto("Eletrônicos", new Produto("Airpods", 1200.00));

        String categoriaAlvo = "Eletrônicos";
        List<Produto> filtrados = categorias.buscarPorCategoria(categoriaAlvo);

        System.out.println(" Catálogo de " + categoriaAlvo + " ");
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado nesta categoria.");
        } else {
            filtrados.forEach(System.out::println);
        }

        System.out.println("\n Resumo ");
        categorias.exibirCategorias();

    }
}
