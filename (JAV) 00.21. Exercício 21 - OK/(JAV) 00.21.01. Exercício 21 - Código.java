package exercicios;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, operador, result, novocalculo;
		
		novocalculo = 1;
		
		while (novocalculo == 1) {
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.println("Escolha o operador lógico desejado (digite o número correspondente):\n1. X\n2. +\n3. /\n4. -\n5. Sair");
		operador = ler.nextDouble();			
				
			if (operador == 1) {
					result = a * b;
					System.out.println("\nO resultado do cálculo é: " + result + "\n");
				}else if (operador == 2) {
					result = a + b;
					System.out.println("\nO resultado do cálculo é: " + result + "\n");
				}else if (operador == 3) {
					result = a / b;
						if (b == 0) {
							System.out.println("Erro. Não pode ser dividido por 0.");
						}else {
							System.out.println("\nO resultado do cálculo é: " + result + "\n");
						}
				}else if (operador == 4) {
					result = a - b;
					System.out.println("\nO resultado do cálculo é: " + result + "\n");
				}else if (operador == 5) {
					System.out.println("Programa encerrado.");
					System.exit(0);
				}else {
					System.out.println("Opção inválida.");
				}
			
			System.out.println("Deseja efetuar um novo cálculo? (digite o número correspondente)\n1. Sim \n2. Não");
			novocalculo = ler.nextDouble();		
		}
		
			if ( novocalculo == 2 ) {
				System.out.println("Programa encerrado.");
				System.exit(0);
			}else {
				System.out.println("Opção inválida.");
		}
	}
}
