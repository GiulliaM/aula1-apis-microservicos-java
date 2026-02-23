package Bloco2;

import java.util.Scanner;

public class exeVeiculo {
	public static void main(String[] args) {

		//criando as instancias dos objetos
		Carro car1 = new Carro("ford", "KA", 4);
		Moto mot1 = new Moto("Harley Davidson", "Iron 883", 883);
		
		System.out.println(mot1.toString());
		System.out.println(car1.toString());		
	}
}
	
	class Veiculo {
		private String marca;
		private String modelo;
		
		public Veiculo( String marcaDigitada,String modeloDigitado) {
			this.setMarca(marcaDigitada);
			this.setModelo(modeloDigitado);
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String toString() {
			return ("Este veiculo é da marca %s, do modelo %s".formatted(this.getMarca(), this.getModelo()));
		}
		
		
		
		
	}
	
	class Carro extends Veiculo{
		private int numeroDePortas;
		
		public Carro(String marcaDigitada, String modeloDigitado, int numeroDePortasDigitada) {
			super(marcaDigitada, modeloDigitado);
			this.setNumeroDePortas(numeroDePortasDigitada);
		}
		
		public int getNumeroDePortas() {
			return numeroDePortas;
		}

		public void setNumeroDePortas(int numeroDePortas) {
			this.numeroDePortas = numeroDePortas;
		}
		
		@Override //isso indica que eu estou sobrescrevendo um metodo da classe pai
		public String toString() {
			return ("%s e tem %d portas".formatted(super.toString(), this.getNumeroDePortas()));
		}

	}
	
	class Moto extends Veiculo{
		private int cilindradas;
		
		public int getCilindradas() {
			return cilindradas;
		}

		public void setCilindradas(int cilindradas) {
			this.cilindradas = cilindradas;
		}
		
		@Override
		public String toString() {
			return ("%s e tem %d cilindradas".formatted(super.toString(),this.getCilindradas()));
		}

		public Moto(String marcaDigitada, String modeloDigitado, int cilindradasdgitado) {
			super(marcaDigitada, modeloDigitado); //passando os parametros para construir primeiro a classe pai (veiculo)
			this.setCilindradas(cilindradasdgitado);
		}
	}
	
	
