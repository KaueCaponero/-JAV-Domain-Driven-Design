package exercicios;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		a = ler.nextDouble();
		
		System.out.print("Digite o segundo lado do triângulo: ");
		b = ler.nextDouble();
		
		System.out.print("Digite o terceiro lado do triângulo: ");
		c = ler.nextDouble();
		
		//Checa se é um triângulo.
		if ( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) ) {
			if ((a==b) && (b==c)) {
				System.out.print("Triangulo equilátero!");
			}else if ((a!=b) && (a!=c) && (b!=c)) {
				System.out.print("Triângulo escaleno");
			}else {
				System.out.print("Triângulo isóceles");
			}
		}else {
			System.out.print("Não é um triângulo!");
			}	
	}
}