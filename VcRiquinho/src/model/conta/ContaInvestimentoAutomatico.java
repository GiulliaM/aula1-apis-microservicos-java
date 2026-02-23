package model.conta;

import model.cliente.Cliente;
import model.produto.ProdutoInvestimento;
import model.produto.RendaFixa;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimentoAutomatico extends Conta {
    private List<ProdutoInvestimento> carteira;

    public ContaInvestimentoAutomatico(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.carteira = new ArrayList<>();
    }

    public void adicionarProdutoCarteira(ProdutoInvestimento produto) {
        this.carteira.add(produto);
    }

    @Override
    public double[] simular(int dias) {
        if (carteira.isEmpty()) {
            return new double[]{0.0, 0.0};
        }

        double rendimentoTotal = 0.0;
        double rendimentoTributavel = 0.0;

        double valorPorProduto = this.saldo / carteira.size();

        for (ProdutoInvestimento produto : carteira) {
            double rendimento = produto.calcularRendimento(valorPorProduto, dias);
            rendimentoTotal += rendimento;


            boolean isento = false;
            if (produto instanceof RendaFixa) {
                RendaFixa rf = (RendaFixa) produto;
                if (dias < rf.getPeriodoCarenciaDias()) {
                    isento = true;
                    System.out.println("-> Aviso: O produto '" + rf.getNome() + "' está no período de carência. Rendimento isento de taxa na simulação.");
                }
            }

            if (!isento) {
                rendimentoTributavel += rendimento;
            }
        }

        double taxaCobrada = rendimentoTributavel * getTitular().getTaxaInvestimentoAutomatico();

        return new double[]{rendimentoTotal, taxaCobrada};

    }

    // metodo para atualizar os produtos antes da simulação
    public void setCarteira(List<ProdutoInvestimento> novaCarteira) {
        this.carteira = novaCarteira;
    }
}