package exercicios;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ex52_Produto[] ListaProdutos = new ex52_Produto[3];
		
		int i;
		
		for (i=0; i<3; i++) {
			ex52_Produto p = new ex52_Produto();
			
			p.id = i+1;
			System.out.println(p.id + ". Digite a descrição do produto: ");
			p.descricao = ler.next();
			System.out.println(p.id + ". Digite o valor do produto: ");
			p.valor = ler.nextDouble();
			System.out.println(p.id + ". Digite a quantidade do produto: ");
			p.qtd = ler.nextDouble();
			
			ListaProdutos[i] = p;
		}
		
		System.out.println("Os produtos de valor menor do que R$ 100,00 são: ");
		
		for (i=0; i<3; i++) {
			if (ListaProdutos[i].valor < 100) {
				System.out.println("ID: " + ListaProdutos[i].id);
				System.out.println("Descrição: " + ListaProdutos[i].descricao);
				System.out.println("Valor: R$ " + ListaProdutos[i].valor);
				System.out.println("Quantidade: " + ListaProdutos[i].qtd + " UN\n\n");
			}
		}
	}
}
