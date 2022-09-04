package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int base, altura, area;
	
		System.out.printf("Digite a base do retângulo: ");
		base = ler.nextInt();
	
		System.out.printf("Digite a altura do retângulo: ");
		altura = ler.nextInt();
	
		area = base * altura;
	
		System.out.printf("A área do retângulo é %d",area);
		
	}

}