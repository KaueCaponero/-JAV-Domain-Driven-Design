package exercicios;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double preco, precodesconto;
		int parcelamento, forma_pgto;
		
		System.out.println("Digite o preço do produto: ");
		preco = ler.nextDouble();
		
		System.out.println("Qual será a condição do pagamento? (Digite o número correspondente)\n1. À Vista\n2. Parcelado em 2x\n3. Parcelado em 3x");
		parcelamento = ler.nextInt();
		
		if (parcelamento == 1) {
			
			System.out.println("Qual será a forma de pagamento? (Digite o número correspondente)\n1. Dinheiro\n2. Cheque\n3. Cartão de Crédito");
			forma_pgto = ler.nextInt();
			
			if (forma_pgto == 1) {
				precodesconto = preco * (100 - 10)/100;
				System.out.println("O valor final a ser pago é de R$ " + precodesconto + " à vista, no dinheiro.");		
			}else if (forma_pgto == 2) {
				precodesconto = preco * (100 - 10)/100;
				System.out.println("O valor final a ser pago é de R$ " + precodesconto + " à vista, no cheque.");
			}else if (forma_pgto == 3) {
				precodesconto = preco * (100 - 15)/100;
				System.out.println("O valor final a ser pago é de R$ " + precodesconto + " à vista, no cartão de crédito.");
			}
		}else if (parcelamento == 2) {
			precodesconto = preco;
			System.out.println("O valor final a ser pago é de R$ " + preco + " parcelado em 2x, no cartão de crédito.");
		}else if (parcelamento == 3) {
			precodesconto = preco * (100 + 10)/100;
			System.out.println("O valor final a ser pago é de R$ " + precodesconto + " parcelado em 3x, no cartão de crédito.");
		}else {
			System.out.println("Opção Inválida.");
		}
	}
}