package Bloco1.Exerc4;

public class exer4 {
	public static void main(String[] args) {
		System.out.print("Soma de impares em um array\n");
		
		int[] numeros = {0,1,2,3,4,5,6,7,8,9};
		int resultado = 0;
		
		for (int num : numeros) {
			if (num % 2 == 1)
			resultado += num;
		}
		
		System.out.print("A soma dos numeros impares é %d".formatted(resultado));
		
	}

}
