package exercicios;

import java.util.Scanner;

public class ex51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ex51_Pessoa[] ListaPessoas = new ex51_Pessoa[5];
		
		int i, id;
		
		for (i=0; i<5; i++) {
			ex51_Pessoa p = new ex51_Pessoa();
			
			p.id = i+1;
			System.out.println(p.id + ". Digite seu nome: ");
			p.nome = ler.next();
			System.out.println(p.id + ". Digite sua idade: ");
			p.idade = ler.nextInt();
			System.out.println(p.id + ". Digite seu e-mail: ");
			p.email = ler.next();
			
			ListaPessoas[i] = p;
		}
		
		System.out.println("As pessoas com mais de 18 anos são: \n");
		
		for (i = 0; i<5; i++) {
			if (ListaPessoas[i].idade >= 18) {
			System.out.println("ID: " + ListaPessoas[i].id);
			System.out.println("NOME: " + ListaPessoas[i].nome);
			System.out.println("IDADE: " + ListaPessoas[i].idade);
			System.out.println("EMAIL: " + ListaPessoas[i].email + "\n\n");
			}
		}
	}
}
