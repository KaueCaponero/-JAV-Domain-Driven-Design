package exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextDouble();
		
		System.out.printf("Digite o 3º número: ");
		n3 = ler.nextDouble();
		
		System.out.printf("Digite o 4º número: ");
		n4 = ler.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("A média dos 4 valores é de %f",media);
		
		
		
			
		}

	}