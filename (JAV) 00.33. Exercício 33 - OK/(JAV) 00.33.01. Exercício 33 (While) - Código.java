package exercicios;

import java.util.Scanner;

public class ex33w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		System.out.println("Qual é o seu sexo? (M para masculino e F para feminino): ");
		sexo = ler.nextLine();
		
		//sexo = sexo.toUpperCase();
		
			while (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {;
				System.out.println("Sexo inválido.");
				System.out.println("Qual é o seu sexo? (M para masculino e F para feminino): ");
				sexo = ler.nextLine();
			}
	
			if ( sexo.toUpperCase().equals("M") ) {
				System.out.println("Você é do sexo masculino.");
			}else {
				System.out.println("Você é do sexo feminino.");
			}
	}
}