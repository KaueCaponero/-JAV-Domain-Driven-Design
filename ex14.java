package exercicios;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.print("Digite o seu peso (kg): ");
		peso = ler.nextDouble();
		
		System.out.print("Digite a sua altura (m): ");
		altura = ler.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if (imc < 19) {
			System.out.printf("O seu imc é de %.2f. Você está abaixo do peso ideal.", imc);		
		}else if (imc >= 19 & imc < 24) {
			System.out.printf("O seu imc é de %.2f. Você está no peso ideal.", imc);		
		}else {
			System.out.printf("O seu imc é de %.2f. Você está acima do peso ideal", imc);
		}
		

	}

}