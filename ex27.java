package exercicios;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, result;
		
		System.out.println("Digite um valor: ");
		a = ler.nextDouble();
		
		if ( (a == 0)) {
			System.out.println("O valor digitado é nulo (0).");
		}else if ( (a % 2) == 0) {
			result = a + 5;
			System.out.println("O valor digitado é par, portando (" + a + ") + 5 = " + result);
		}else {
			result = a + 8;
			System.out.println("O valor digitado é impar, portando (" + a + ") + 8 = " + result);
		}
	}
}
