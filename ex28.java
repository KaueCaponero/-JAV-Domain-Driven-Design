package exercicios;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		c = ler.nextDouble();
		
		if ( (a > b) && (a > c) ) {
			if (b > c) {
				System.out.println("Ordem Crescente: \n1. " + c + "\n2. " + b + "\n3. " + a);
			}else {
				System.out.println("Ordem Crescente: \n1. " + b + "\n2. " + c + "\n3. " + a);
			}
		}else if ( (b > a) && (b > c)) {
			if (a > c) {
				System.out.println("Ordem Crescente: \n1. " + c + "\n2. " + a + "\n3. " + b);
			}else {
				System.out.println("Ordem Crescente: \n1. " + a + "\n2. " + c + "\n3. " + b);
			}
		}else {
			if (a > b) {
				System.out.println("Ordem Crescente: \n1. " + b + "\n2. " + a + "\n3. " + c);
			}else {
				System.out.println("Ordem Crescente: \n1. " + a + "\n2. " + b + "\n3. " + c);
			}
		}

	}

}
