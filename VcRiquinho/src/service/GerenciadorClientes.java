package service;

import model.cliente.Cliente;
import model.cliente.PessoaFisica;
import model.cliente.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorClientes {
    private List<Cliente> bancoDeClientes;

    public GerenciadorClientes(){
        this.bancoDeClientes = new ArrayList<>();
    }

    //metodo create
    public void adicionarCliente(Cliente cliente) {
        if (cliente.getContas().isEmpty()) {
            System.out.println("Erro: Cliente deve possuir ao menos uma conta.");
            return;
        }
        //verifica duplicidade
        for (Cliente c : bancoDeClientes) {
            if (c instanceof PessoaFisica && cliente instanceof PessoaFisica) {
                if (((PessoaFisica) c).getCpf()
                        .equals(((PessoaFisica) cliente).getCpf())) {

                    System.out.println("Erro: CPF já cadastrado no sistema.");
                    return;
                }
            }
            if (c instanceof PessoaJuridica && cliente instanceof PessoaJuridica) {
                if (((PessoaJuridica) c).getCnpj()
                        .equals(((PessoaJuridica) cliente).getCnpj())) {

                    System.out.println("Erro: CNPJ já cadastrado no sistema.");
                    return;
                }
            }
        }
        bancoDeClientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso!");
    }

    //metodo read
    public void listarClientes(){
        if(bancoDeClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Lista de clientes cadastrados:");
        for (Cliente c : bancoDeClientes) {
            String tipo = (c instanceof PessoaFisica) ? "PF (CPF: " + ((PessoaFisica) c).getCpf() + ")"
                    : "PJ (CNPJ: " + ((PessoaJuridica) c).getCnpj() + ")";
            System.out.println("- " + c.getNome() + " | " + c.getEmail() + " | " + tipo + " | Contas: " + c.getContas().size());
        }
    }

    //metodo read especifico
    public Cliente buscarCliente(String nome) {
        for (Cliente c : bancoDeClientes) {
            if (c.getNome().trim().equalsIgnoreCase(nome.trim())) {
                return c;
            }
        }
        return null;
    }

    // metodo update
    public boolean atualizarCliente(String nomeAtual, String novoNome, String novoEmail) {
        Cliente c = buscarCliente(nomeAtual);

        if (c != null) {
            c.setNome(novoNome);
            c.setEmail(novoEmail);
            System.out.println("Cadastro de cliente atualizado com sucesso!");
            return true;
        }
        System.out.println("Erro: Cliente não encontrado.");
        return false;
    }

    // metodo delete
    public boolean removerCliente(String nome) {
        Cliente c = buscarCliente(nome);
        if (c != null) {
            bancoDeClientes.remove(c);
            System.out.println("Cliente removido com sucesso!");
            return true;
        }
        System.out.println("Cliente não encontrado.");
        return false;
    }
}
