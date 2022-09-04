package exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double aresta, area;
		
		System.out.printf("Digite o valor da aresta do quadrado: ");
		aresta = ler.nextDouble();
		
		area = Math.pow(aresta, 2);
		
		System.out.printf("A área do quadrado é %.2f", area);

	}

}
