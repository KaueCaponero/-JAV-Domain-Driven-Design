package exercicios;

import java.util.Scanner;

public class ex50w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o n�mero inicial do intervalo: ");
		a = ler.nextInt();
		
		System.out.println("Digite o n�mero final do intervalo: ");
		b = ler.nextInt();
		
		while (a <= b) {
			if (a >= 10) {
				if (a % 2 == 0){
					System.out.println(a);
				}
			}a++;
		}
		System.out.println("S�o os n�meros pares no intervalo informado.");
		System.out.println("Programa Encerrado");
	}
}