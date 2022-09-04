package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
		
		System.out.print("Digite seu peso (kg): ");
		peso = ler.nextDouble();
		
		System.out.print("Digite sua altura (m): ");
		altura = ler.nextDouble();
		
		System.out.print("Digite seu sexo (m ou f): ");
		sexo = ler.next();
		
		imc = peso / Math.pow(altura, 2);
		
			if ( sexo.equals("m") ) {
				if (imc < 20) {
					System.out.printf("O seu imc é de %.2f e você está abaixo do peso ideal.", imc);
				}else if ( (imc >=20) && (imc <25) ) {
					System.out.printf("O seu imc é de %.2f e você está no peso ideal.", imc);
				}else {
					System.out.printf("O seu imc é de %.2f e você está acima do peso ideal.", imc);
				}
			}else {
				if (imc < 19) {
					System.out.printf("O seu imc é de %.2f e você está abaixo do peso ideal.", imc);
				}else if ( (imc >=19) && (imc <24) ) {
					System.out.printf("O seu imc é de %.2f e você está no peso ideal.", imc);
				}else {
					System.out.printf("O seu imc é de %.2f e você está acima do peso ideal.", imc);		
				}
			}
	}
}