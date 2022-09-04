package exercicios;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a;
		
		System.out.println("Digite um valor para verificar se é par ou ímpar: ");
		a = ler.nextDouble();
		
		if ( (a % 2) == 0) {
			System.out.println("O valor digitado (" + a + ") é par.");
		}else {
			System.out.println("O valor digitado (" + a + ") é impar.");
		}

	}

}
