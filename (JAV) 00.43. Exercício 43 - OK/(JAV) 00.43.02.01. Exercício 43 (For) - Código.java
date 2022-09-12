package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class ex43f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n, i, soma, dividendo, divisor, divisao;
		
		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = ler.nextInt();
		
		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = ler.nextInt();
		}
		
		soma = 0;
		
		for (i = 1; i <= n; i++) {
		    dividendo = (Math.pow(i,2)) + 1;
    	    divisor = (Math.pow(i,3));
    	    divisao = dividendo / divisor;
    	    System.out.println(i + ". " +(int) dividendo + "/" + (int) divisor);
    	    soma = soma + divisao;
		}
		System.out.printf("A soma é: %.2f", soma);
	}
}