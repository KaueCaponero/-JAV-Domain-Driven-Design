package exercicios;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		n2 = ler.nextDouble();
		
		if (n1 < n2) {
			System.out.printf("O primeiro valor é o menor: %.2f", n1);
		}else {
			System.out.printf("O segundo valor é o menor: %.2f", n2);
		}
				
	}

}