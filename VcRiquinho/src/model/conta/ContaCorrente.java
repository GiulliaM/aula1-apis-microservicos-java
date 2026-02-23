package model.conta;

import model.cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente titular, double saldoInicial){
        super(titular, saldoInicial);
    }

    @Override
    public double[] simular(int dias){
        return new double[]{0.0, 0.0}; //nao rende taxa sobre rendimento
    }
}
