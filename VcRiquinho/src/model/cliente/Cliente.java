package model.cliente;

import model.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nome;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
    }

    public abstract double getTaxaInvestimentoAutomatico();

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Conta> getContas() {
        return contas;
    }

}
