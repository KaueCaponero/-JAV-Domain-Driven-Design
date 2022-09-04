package exercicios;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, result;
		
		System.out.println("Digite um valor: ");
		a = ler.nextDouble();
		
		if (a < 0) {
			result = 3 * a;
			System.out.println("O valor digitado (" + a + ") é negativo. Portanto, seu triplo é " + result);			
		}else if (a > 0) {
			result = 2 * a;
			System.out.println("O valor digitado (" + a + ") é positivo. Portanto, seu dobro é " + result);
		}else {
			System.out.println("O valor digitado é " + a);
		}

	}

}
