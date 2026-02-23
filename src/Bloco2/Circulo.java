package Bloco2;

import java.util.Scanner;

public class Circulo {
	 private double raio;
	 
	 public Circulo(double raiorecebido) {
		 this.setRaio(raiorecebido);
	 }

	 public double getRaio() {
		 return raio;
	 }

	 public void setRaio(double raio) {
		 if(raio > 0) {
			 this.raio = raio;
		 }else {
			 throw new IllegalArgumentException("O valor do raio nao pode ser menos ou igual a zero");
		 }
	 }
	 
	 public double calcularArea(){
		 double area;
		 area = 3.14 * (this.getRaio() * this.getRaio());
		 return area;
	 }
	 
	 public static void main(String[] args) {
		 //declarandfo novo leitor de input
		 Scanner leitor = new Scanner(System.in);
		 int raioDigitado = 0;
		 
		 System.out.print("Digite o valor do raio do circulo: ");
		 raioDigitado = Integer.parseInt(leitor.nextLine());
		 Circulo bola = new Circulo(raioDigitado);
		 System.out.print("a area do circulo e %f".formatted(bola.calcularArea()));
		 
	 }
	 
}
