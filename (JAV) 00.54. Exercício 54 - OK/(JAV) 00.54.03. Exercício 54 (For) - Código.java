package exercicios;

import java.util.Scanner;

public class ex54f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i;
		String respConta;
		
		ex54_Cliente[] ListaCliente = new ex54_Cliente[5];

		for (i = 0; i < 5; i++) {
			ex54_Cliente a = new ex54_Cliente();
			
			a.id = i+1;
			
			System.out.println("Digite seu nome: ");
			a.nome = ler.next();
			
			System.out.println("Digite sua idade: ");
			a.idade = ler.nextInt();
			
			System.out.println("Digite seu email: ");
			a.email = ler.next();
			
			System.out.println("Você possui conta bancária? (S ou N): ");
			respConta = ler.next().toUpperCase();
			
			while ((!respConta.equals("S")) && (!respConta.equals("N"))) {
				System.out.println("Resposta Inválida.");
				System.out.println("Você possui conta bancária? (S ou N): ");
				respConta = ler.next().toUpperCase();
			}
			
			if (respConta.equals("S")) {				
				ex54_ContaBancaria b = new ex54_ContaBancaria();
					
				System.out.println("Digite a sua agência: ");
				b.agencia = ler.next();
				
				System.out.println("Digite sua conta: ");
				b.numero = ler.next();
				
				System.out.println("Digite seu saldo: ");
				b.saldo = ler.nextDouble();
				
				a.conta = b;
				
			}else {
				ListaCliente[i] = a;
				continue;
			}ListaCliente[i] = a;
		}System.out.println("As pessoas que possuem contas bancárias são:\n");
		
		i = 0;
		
		for (i = 0; i < 5; i++) {
			if (ListaCliente[i].conta != null) {
				System.out.println("ID: " + ListaCliente[i].id + " - " + ListaCliente[i].exibirNomeIdade() + " - Email: " + ListaCliente[i].email);
				System.out.println("Dados Bancários: "); 
				System.out.println(ListaCliente[i].exibirDadosConta() + "\n");
			}
		}
	}
}

