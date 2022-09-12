package exercicios;

import java.util.Scanner;

public class ex32w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor (deve ser maior do que o primeiro): ");
		b = ler.nextDouble();
		
		while (b <= a) {
			System.out.println("O segundo valor digitado (" + b + ") deve ser maior do que o primeiro (" + a +")");
			System.out.println("Digite o segundo valor (deve ser maior do que o primeiro): ");
			b = ler.nextDouble();
		}
		
		System.out.println("O segundo valor digitado (" + b + ") é maior do que o primeiro (" + a +")");

	}

}
