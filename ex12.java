package exercicios;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite a base do retângulo: ");
		base = ler.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		if (area > 100) {
			System.out.printf("A área do terreno é %.2f. Terreno grande", area);
		}else {
			System.out.printf("A área do terreno é %.2f Terreno pequeno", area);
		}
		

	}

}