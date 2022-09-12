package exercicios;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, valorpago, troco;
		
		System.out.printf("Digite o valor do 1º produto: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do 2º produto: ");
		p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do 3º produto: ");
		p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do 4º produto: ");
		p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do 5º produto: ");
		p5 = ler.nextDouble();
		
		System.out.printf("Digite o valor pago total dos produtos: ");
		valorpago = ler.nextDouble();
		
		troco = valorpago - (p1 + p2 + p3 + p4 + p5);
		
		System.out.printf("O troco é de R$ %.2f", troco);
			
	}

}