package exercicios;

import java.util.Scanner;

public class ex56 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, qtdprodutos;
		String respCateg;
		
		qtdprodutos = 2;
		
		ex56_Produto[] ListaProduto = new ex56_Produto[qtdprodutos];
		
		for (i = 0; i < qtdprodutos; i++) {
			ex56_Produto a = new ex56_Produto();
			
			a.setId(i+1);
			
			System.out.println("Digite o nome do " + (i+1) + "º produto: ");
			a.setNome(ler.next());
			
			System.out.println("Digite o preço do " + (i+1) + "º produto: ");
			a.setPreco(ler.nextDouble());
			
			System.out.println("Digite a quantidade do " + (i+1) + "º produto: ");
			a.setQtd(ler.nextDouble());
			
			System.out.println("O produto possui alguma categoria? (S ou N)");
			respCateg = ler.next().toUpperCase();	
			
			while (!respCateg.equals("S") && !respCateg.equals("N")) {
				System.out.println("Resposta Inválida.");
				System.out.println("O produto possui alguma categoria? (S ou N)");
				respCateg = ler.next().toUpperCase();
			}
				
			if (respCateg.equals("S")) {
				ex56_Categoria b = new ex56_Categoria();
				
				System.out.println("Qual o ID da categoria? ");
				b.setId(ler.nextInt());
				
				System.out.println("Qual o Nome da categoria? ");
				b.setNome(ler.next());
				
				a.setCategoria(b);
				
			}else {
				ListaProduto[i] = a;
				continue;
			}ListaProduto[i] = a;
		}System.out.println("Os Produtos cadastrados foram: \n");
			
		i = 0;
		
		for (i = 0; i < qtdprodutos; i++) {
			System.out.println("ID do Produto: " + ListaProduto[i].getId());
			System.out.println("Nome do Produto: " + ListaProduto[i].getNome());
			System.out.println("Preço do Produto: R$ " + ListaProduto[i].getPreco());
			System.out.println("Quantidade do Produto: " + ListaProduto[i].getQtd());
				if (ListaProduto[i].getCategoria() != null) {
					System.out.println(ListaProduto[i].exibirIdCategoria() + "\n");
				}
				else {
					System.out.println("\n");
					continue;
				}	
		}	
	}
}
