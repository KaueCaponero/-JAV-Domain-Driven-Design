package exercicios;

import java.util.Scanner;

public class ex31w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a;
		
		System.out.println("Digite um valor POSITIVO: ");
		a = ler.nextDouble();
		
		while (a <= 0) {
			System.out.println("O valor digitado não é positivo.");
			System.out.println("Digite um valor POSITIVO: ");
			a = ler.nextDouble();
		}
		
		System.out.println("O valor digitado é positivo: " + a);

	}

}
