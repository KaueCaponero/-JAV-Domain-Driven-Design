package exercicios;

import java.util.Scanner;

public class ex38w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a1, an, sn;
		
		a1 = 1;
		
		System.out.println(a1 + " +");
		
		an = 2;
		
		while (an <= 100) {
			System.out.println(an + " +");
			an = an + 1;
		}
		
		an = an - 1;
		sn = ((a1 + an) * an) / 2;
		System.out.println("Soma = " + sn);
	}

}
