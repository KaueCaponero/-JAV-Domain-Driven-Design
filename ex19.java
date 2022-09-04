package exercicios;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double p1, p2, media;
	
	System.out.print("Digite a sua nota da P1: ");
	p1 = ler.nextDouble();
	
	System.out.print("Digite a sua nota da P2: ");
	p2 = ler.nextDouble();
	
	media = ( (p1 + (2 * p2)) /  3);
	
	if (media < 5) {
		System.out.printf("A sua média final é de %.2f. Reprovado", media);
	}else {
		System.out.printf("A sua média final é de %.2f. Aprovado", media);
	}

	}

}
