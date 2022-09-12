package exercicios;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c, f;
		
		System.out.printf("Digite a temperatura em graus Celsius: ");
		c = ler.nextDouble();
		
		f = (c * 9/5) + 32;
		
		System.out.printf("%f graus Celsius equivale a %f graus em Fahrenheit",c,f);

	}

}