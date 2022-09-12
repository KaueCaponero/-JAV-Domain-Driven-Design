package exercicios;

import java.util.Scanner;

public class ex35w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, i, tab;
		
		System.out.println("Digite um valor positivo: ");
		a = ler.nextInt();
		
		while (a <=0 ) {
			System.out.println("Valor inválido.");
			System.out.println("Digite um valor positivo: ");
			a = ler.nextInt();
		}
		
		i = 1;
		
		while (i <= 10) {
			tab = a * i;
			System.out.println(tab);
			i++;
		}

	}

}
