package exercicios;

import java.util.Scanner;

public class ex39w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a1, an, i, ax;
		
		a1 = 1;
		an = 1;
		i = 1;
		
		while (i <= 30) {
			while (i <= 2) {
				System.out.println(i + ". " + an);
				i++;
			}ax = a1 + an;
			System.out.println(i + ". " + ax);
			a1 = an;
			an = ax;
			i++;					
		}
	}
}
