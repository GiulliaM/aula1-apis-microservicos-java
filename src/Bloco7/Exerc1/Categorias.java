package Bloco7.Exerc1;

import java.util.*;

public class Categorias {
    private Map<String, List<Produto>> catalogo;

    public Categorias() {
        this.catalogo = new HashMap<>();
    }

    public void adicionarProduto(String categoria, Produto produto) {
        this.catalogo.computeIfAbsent(categoria, k -> new ArrayList<>()).add(produto);
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        return this.catalogo.getOrDefault(categoria, Collections.emptyList());
    }

    public void exibirCategorias() {
        System.out.println("Categorias disponíveis: " + catalogo.keySet());
    }
}
