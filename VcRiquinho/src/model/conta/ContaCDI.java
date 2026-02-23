package model.conta;

import model.cliente.Cliente;

public class ContaCDI extends Conta{
    private static final double TAXA_SERVICO = 0.0007;
    private static final double CDI_MENSAL = 0.01;

    public ContaCDI(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public double[] simular(int dias) {
        // Rende 1/30 do CDI diariamente
        double taxaDiaria = CDI_MENSAL / 30.0;
        double rendimento = this.saldo * taxaDiaria * dias;

        // Taxa de 0,07% sobre os ganhos
        double taxaCobrada = rendimento * TAXA_SERVICO;

        return new double[]{rendimento, taxaCobrada};
    }
}
