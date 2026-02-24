package Bloco2.Exerc8;

public class ContaBanco {
	public static void main(String[] args) {
		ContaBancaria contaNormal = new ContaBancaria(1200);
		
		//como na aassinatura do metodo sacar inidcar que devemos ter uma trataiva de erro vamos usar try-catch
		try {//tentamos sacar
			contaNormal.sacar(1300);
			
		}catch(SaldoInsuficienteException erro)
		{//se der erro capturamos o erro sem travar o programa
			System.out.println(erro.getMessage());
			//getmensage pega o texto que colocamos no erro la na classe SaldoInsuficienteExceptio
			
		}
		
		
	}
}

class ContaBancaria{
	private double saldo;
	
	public ContaBancaria(double saldoInicial) {
		//seria o setSaldo pq ele vai inicializar a conta com um saldo tal
		this.saldo = saldoInicial;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//caso um metodo possa chamar uma exceção personalizada de proposito devemos indicar na assinatura do metodo para assim ficar visivel que nesse metodo deve ser criado um try-catch caso a exceção aconteca
	public boolean sacar(double saqueDesejado) throws SaldoInsuficienteException {
		if(saqueDesejado <= this.getSaldo()) {
			this.saldo -= saqueDesejado;
			System.out.println("Saque realizado com sucesso, saldo atual %f".formatted(this.getSaldo()));
			return true;
		}else {
			//se o saque for maior do q a qtd que temos no saldo vamos lancar um erro
			throw new SaldoInsuficienteException("Saldo insuficiente par o saque desejado!");
		}
	}
}

//excessao para caso o saque for maior que o saldo atual da conta 
class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String mensagemDoErro) {
		//enviando a mensagem do erro que capturou para a classe Extends para o java poder tratar
		super(mensagemDoErro);
	}
}

