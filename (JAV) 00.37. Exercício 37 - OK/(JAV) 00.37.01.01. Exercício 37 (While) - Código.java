package exercicios;

import java.util.Scanner;

public class ex37w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, i, tab;
		String tecla;
		
		a = 1;
		i = 1;
		tecla = "x";
		
			while (i <= 20) {
				System.out.println("Tabuada do (" + i + ").");
			
				while (a <= 10) {
					tab = a * i;
					System.out.println(tab);
					a++;
				}
				i++;
				a = 1;
			
				System.out.println("Pressione uma tecla para a próxima tabuada.");
				tecla = ler.nextLine();				
			}
		System.out.println("Progama Encerrado.");
	}
}