package model.conta;

import model.cliente.Cliente;

public abstract class Conta {
    private Cliente titular;
    protected double saldo;

    public Conta(Cliente titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        titular.adicionarConta(this);
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public abstract double[] simular(int dias);
}
