package ativ;

public class TestaCadastro {
	public static void main(String[] args){
		CadastroPessoas cadastro = new CadastroPessoas();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		cliente.setNascimento(new Data(12,4, 1975));
		cliente.setCodigo(1);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Eduarda");
        funcionario.setNascimento(new Data(5,8,2006));
        funcionario.setSalario(3500.0f);

        Gerente gerente = new Gerente();
        gerente.setNome("Adriana");
        gerente.setNascimento(new Data(31, 11, 1982));
        gerente.setSalario(8500.0f);
        gerente.setArea("Gastronomia");

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);
        
        System.out.println("cadastros realizados");
        cadastro.imprimeCadastro();
		
		
	}
}
