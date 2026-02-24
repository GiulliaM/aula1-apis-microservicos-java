package main;

import controller.CadastroPessoas;
import model.Cliente;
import model.Data;
import model.Funcionario;
import model.Gerente;

public class TestaCadastro {
    public static void main (String[] args){
        CadastroPessoas cp = new CadastroPessoas(10);

        Data d1 = new Data(7,9,2005);
        Cliente c1 = new Cliente("Ana Silva", d1, 1);

        Data d2 = new Data(20, 8, 1985);
        Funcionario f1 = new Funcionario("Julio Cézar", d2, 3000.0f);

        Data d3 = new Data(15, 12, 1978);
        Gerente g1 = new Gerente("Jordana Rocha", d3, 8000.0f, "TI");

        cp.cadastraPessoa(c1);
        cp.cadastraPessoa(f1);
        cp.cadastraPessoa(g1);

        cp.imprimeCadastro();
    }
}
