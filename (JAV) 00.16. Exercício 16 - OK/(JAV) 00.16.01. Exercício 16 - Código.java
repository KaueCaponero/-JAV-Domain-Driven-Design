package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, cadj, cops, hipt;
		
		System.out.print("Digite a primeira medida do triângulo: ");
		a = ler.nextFloat();
		
		System.out.print("Digite a segunda medida do triângulo: ");
		b = ler.nextFloat();
		
		System.out.print("Digite a terceira medida do triângulo: ");
		c = ler.nextFloat();
		
		if ( (a > b) && (a > c)) {
			hipt = a;
			cadj = b;
			cops = c;
		}else if ( (b > a) && (b > c)) {
			hipt = b;
			cadj = a;
			cops = c;
		}else {
			hipt = c;
			cadj = a;
			cops = b;
		}
		
		if ( (Math.pow(cadj, 2) + Math.pow(cops, 2) ) == Math.pow(hipt, 2) ) {
			System.out.println("O triângulo informado é um triângulo retângulo!");
		}else {
			System.out.println("O triângulo informado não é um triângulo retângulo.");					
			
		}

	}

}
