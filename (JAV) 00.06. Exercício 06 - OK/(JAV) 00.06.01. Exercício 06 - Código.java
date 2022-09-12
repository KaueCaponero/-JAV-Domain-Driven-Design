package exercicios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double qtddol, cotdol, reais;
		
		System.out.printf("Digite a quantidade de dólares: ");
		qtddol = ler.nextDouble();
		
		System.out.printf("Digite a cotação atual do dólar: ");
		cotdol = ler.nextDouble();
		
		reais = qtddol * cotdol;
		
		System.out.printf("%.2f dólares cotados em %.2f equivalem a R$ %.2f",qtddol,cotdol,reais);
			
	}

}