package exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
int base, altura, area;
		
		System.out.printf("Digite a base do triângulo: ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do triângulo: ");
		altura = ler.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é %d", area);		
		

	}

}

		