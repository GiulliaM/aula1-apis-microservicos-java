package service;

import model.produto.ProdutoInvestimento;
import model.produto.RendaFixa;
import model.produto.RendaVariavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<ProdutoInvestimento> bancoDeProdutos;

    public GerenciadorProdutos() {
        this.bancoDeProdutos = new ArrayList<>();
    }

    // metodo create
    public void adicionarProduto(ProdutoInvestimento produto) {
        bancoDeProdutos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' cadastrado com sucesso!");
    }

    // metodo read
    public void listarProdutos() {
        if (bancoDeProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\nLista de Produtos Financeiros");
        for (ProdutoInvestimento p : bancoDeProdutos) {
            String tipo = "Desconhecido";

            if (p instanceof RendaFixa) {
                tipo = "Renda Fixa (Carência: " + ((RendaFixa) p).getPeriodoCarenciaDias() + " dias)";
            } else if (p instanceof RendaVariavel) {
                tipo = "Renda Variável";
            }
            System.out.println("- " + p.getNome() + " | Tipo: " + tipo + " | Descrição: " + p.getDescricao());
        }
    }

    // metodo read especifico
    public ProdutoInvestimento buscarProduto(String nome) {
        for (ProdutoInvestimento p : bancoDeProdutos) {
            if (p.getNome().trim().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // metodo update
    public boolean atualizarProduto(String nomeAtual, String novoNome, String novaDescricao) {
        ProdutoInvestimento p = buscarProduto(nomeAtual);

        if (p != null) {
            p.setNome(novoNome);
            p.setDescricao(novaDescricao);
            System.out.println("Produto financeiro atualizado com sucesso!");
            return true;
        }

        System.out.println("Erro: Produto não encontrado.");
        return false;
    }

    // metodo delete
    public boolean removerProduto(String nome) {
        ProdutoInvestimento p = buscarProduto(nome);
        if (p != null) {
            bancoDeProdutos.remove(p);
            System.out.println("Produto removido com sucesso!");
            return true;
        }
        System.out.println("Produto não encontrado.");
        return false;
    }

    // para pegar produtos disponiveis
    public List<ProdutoInvestimento> getTodosProdutos() { return bancoDeProdutos; }
}