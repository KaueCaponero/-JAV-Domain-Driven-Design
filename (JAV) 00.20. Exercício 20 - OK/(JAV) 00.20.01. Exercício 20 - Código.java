package exercicios;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double p1, p2;
	
	System.out.print("Digite a sua nota da P1: ");
	p1 = ler.nextDouble();
	
	p2 = (15 - p1) / 2;
	
	System.out.printf("Você precisa tirar %.2f na P2 para ser aprovado com a média mínima de 5,0.", p2);

	}

}
