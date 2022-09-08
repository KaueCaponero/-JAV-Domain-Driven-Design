package exercicios;

import java.util.Scanner;

public class ex38f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a1, an, sn;
		
		a1 = 1;
		
		System.out.println(a1 + " +");
		
		an = 2;
		
		for (an=2; an <= 100; an = an + 1) {
			System.out.println(an + " +");

		}
		
		an = an - 1;
		sn = ((a1 + an) * an) / 2;
		System.out.println("Soma = " + sn);
	}

}