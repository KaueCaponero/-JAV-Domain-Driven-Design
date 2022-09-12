package exercicios;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		int novocalculo;
		
		novocalculo = 1;
		
		while (novocalculo == 1) {
		
			System.out.println("Digite o valor de A: ");
			a = ler.nextDouble();
			
			System.out.println("Digite o valor de B: ");
			b = ler.nextDouble();
			
			System.out.println("Digite o valor de C:");
			c = ler.nextDouble();
			
			if (a + b < c) {
				System.out.println(a + " + " + b + " < " + c + ". Ou seja, o valor de A + B é menor que C.\n");
				
			}else {
				System.out.println(a + " + " + b + " não é < " + c + ". Ou seja, o valor de A + B  não é menor que C.\n");
			}
		
		System.out.println("Deseja efetuar novo cálculo? (digite o valor correspondente)\n1. Sim\n2. Não\n");
		novocalculo = ler.nextInt();
		
		}
	
	System.out.println("Programa Encerrado");

	}

}
