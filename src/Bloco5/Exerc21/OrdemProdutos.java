package Bloco5.Exerc21;

import java.util.LinkedHashMap;


public class OrdemProdutos {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();
        produtos.put(60, "Mouse");
        produtos.put(10, "Adaptador");
        produtos.put(45, "Caneta");
        produtos.put(66, "Teclado");
        produtos.put(7, "Fone");

        produtos.forEach((id, nome) -> System.out.println(id + ":" + nome));

    }
}
