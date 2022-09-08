package exercicios;

import java.util.Scanner;

public class ex36f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, a, b, i, tab;
		
		System.out.println("Digite um valor positivo para calcularmos a tabuada: ");
		x = ler.nextInt();
		
		while (x <= 0) {
			System.out.println("Valor inv�lido.");
			System.out.println("Digite um valor positivo para calcularmos a tabuada: ");
			x = ler.nextInt();
		}
		
		System.out.println("Digite o valor inicial do intervalo da tabuada: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor final do intervalo da tabuada: ");
		b = ler.nextInt();
		
		while (b <=a) {
			System.out.println("O valor final do intervalo da tabuada (" + b + ") deve ser maior do que o valor inicial (" + a + ").");
			System.out.println("Digite o valor final do intervalo da tabuada: ");
			b = ler.nextInt();
		}
		
		i = b;
		
		for (i=b; i >= a; i=i-1) {
			tab = a * i;
			System.out.println(tab);
		}

	}

}
