package exercicios;

import java.util.Scanner;

public class ex55 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i;
		String respConta;
		
		ex55_Cliente[] ListaCliente = new ex55_Cliente[5];

		for (i = 0; i < 5; i++) {
			ex55_Cliente a = new ex55_Cliente();
			
			a.setId(i+1);			
			
			System.out.println("Digite seu nome: ");
			a.setNome(ler.next());
			
			System.out.println("Digite sua idade: ");
			a.setIdade(ler.nextInt());
			
			System.out.println("Digite seu email: ");
			a.setEmail(ler.next());
			
			System.out.println("Você possui conta bancária? (S ou N): ");
			respConta = ler.next().toUpperCase();
			
			while ((!respConta.equals("S")) && (!respConta.equals("N"))) {
				System.out.println("Resposta Inválida.");
				System.out.println("Você possui conta bancária? (S ou N): ");
				respConta = ler.next().toUpperCase();
			}
			
			if (respConta.equals("S")) {				
				ex55_ContaBancaria b = new ex55_ContaBancaria();
					
				System.out.println("Digite a sua agência: ");
				b.setAgencia(ler.next());
				
				System.out.println("Digite sua conta: ");
				b.setNumero(ler.next());
				
				System.out.println("Digite seu saldo: ");
				b.setSaldo(ler.nextDouble());
				
				a.setConta(b);
				
			}else {
				ListaCliente[i] = a;
				continue;
			}ListaCliente[i] = a;
		}System.out.println("As pessoas que possuem contas bancárias são:\n");
		
		i = 0;
		
		for (i = 0; i < 5; i++) {
			if (ListaCliente[i].getConta() != null) {
				System.out.println("ID: " + ListaCliente[i].getId() + " - " + ListaCliente[i].exibirNomeIdade() + " - Email: " + ListaCliente[i].getEmail());
				System.out.println("Dados Bancários: "); 
				System.out.println(ListaCliente[i].exibirDadosConta() + "\n");
			}
		}
	}
}
