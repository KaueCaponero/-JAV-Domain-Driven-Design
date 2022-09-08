package exercicios;

import java.util.Scanner;

public class ex39f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a1, an, i, ax;
		
		a1 = 1;
		an = 1;
		i = 1;
		
		for (i=1; i <= 30; i = i+1) {
			if (i <= 2) {
				System.out.println(i + ". " + an);
			}else {
				ax = a1 + an;
				System.out.println(i + ". " + ax);
				a1 = an;
				an = ax;					
			}
		}
	}
}