package exercicios.ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex57 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<ex57_Cliente> listaCliente = new ArrayList<>();
		
		int opcao, id, idade;
		String nome, respconta, email, agencia, numero, confirmacao, iniciar;
		double saldo;
		ex57_ContaBancaria conta;
		
		iniciar = "S";
		
		while (iniciar.equals("S")) {
			do {
				
				System.out.println("==> Sistema de Cadastro de Clientes <==\n");
				System.out.println("Escolha uma opção: \n");
				System.out.println("1. Incluir Cliente\n"
						+ "2. Atualizar Cliente\n"
						+ "3. Excluir Cliente\n"
						+ "4. Exibir Clientes\n"
						+ "5. Sair \n");
				System.out.printf("Digite a opção desejada: \n");
				opcao = ler.nextInt();
				
				if (opcao == 1) {
					ex57_Cliente a = new ex57_Cliente();
					
					if (listaCliente.size() == 0) {
						a.setId(1);
					}
					
					else {
						a.setId(listaCliente.get(listaCliente.size() - 1).getId() + 1);
					}

					
					System.out.println("Digite o nome do cliente: ");
					a.setNome(ler.next());
					
					System.out.println("Digite a idade do cliente: ");
					a.setIdade(ler.nextInt());
					
					System.out.println("Digite o email do cliente: ");
					a.setEmail(ler.next());
					
					System.out.println("O cliente possui conta bancária? (S ou N)");
					respconta = ler.next().toUpperCase();
					
					while (!respconta.equals("S") && !respconta.equals("N")) {
						System.out.println("\nResposta Inválida \n");
						System.out.println("O cliente possui conta bancária? (S ou N)");
						respconta = ler.next().toUpperCase();
					}
					
					if (respconta.equals("S")) {
						ArrayList<ex57_ContaBancaria> listaContaBancaria = new ArrayList<>();
						ex57_ContaBancaria b = new ex57_ContaBancaria();
						
						b.setId(listaCliente.size() + 1);
						
						System.out.println("\nDigite a sua agência bancária: ");
						b.setAgencia(ler.next());
						
						System.out.println("Digite a sua conta bancária: ");
						b.setNumero(ler.next());
						
						System.out.println("Digite seu saldo: ");
						b.setSaldo(ler.nextDouble());
						
						listaContaBancaria.add(b);
					}
					
					else {
						a.setConta(null);
					}
					
					listaCliente.add(a);
					System.out.println("\nCliente cadastrado com sucesso!\n");
					System.in.read();
					
				}
				
				if (opcao == 2) {
					
					for(ex57_Cliente a: listaCliente) {
						
						System.out.println(a.exibirDadosCliente());					
						
						if (a.getConta() == null) {
							System.out.println("Cliente não possui conta bancária cadastrada.");
						}
						
						else {
							System.out.println(a.exibirDadosConta());
						}
						
					}
					
					System.out.println("Digite o ID do cliente que deseja atualizar o cadastro: ");
					id = (ler.nextInt());
					
					ex57_Cliente a = listaCliente.get(id-1);
					
					System.out.println("Tem certeza que deseja alterar este cliente? (S ou N) ");
					System.out.println(a.exibirDadosCliente());
					confirmacao = ler.next().toUpperCase();
					
					while (!confirmacao.equals("S") && !confirmacao.equals("N")) {
						System.out.println("\nResposta Inválida \n");
						System.out.println("Tem certeza que deseja alterar este cliente? (S ou N) ");
						System.out.println(a.exibirDadosCliente());
						confirmacao = ler.next().toUpperCase();
					}
					
					if (confirmacao.toUpperCase().equals("S")) {
						listaCliente.remove(id-1);
					}
					
					else {
						iniciar = "S";
						continue;
					}
					
					System.out.println("Digite o novo nome do cliente: ");
					a.setNome(ler.next());
					
					System.out.println("Digite a nova idade do cliente: ");
					a.setIdade(ler.nextInt());
					
					System.out.println("Digite o novo email do cliente: ");
					a.setEmail(ler.next());
					
					System.out.println("O cliente possui conta bancária? (S ou N)");
					respconta = ler.next().toUpperCase();
					
					while (!respconta.equals("S") && !respconta.equals("N")) {
						System.out.println("\nResposta Inválida \n");
						System.out.println("O cliente possui conta bancária? (S ou N)");
						respconta = ler.next().toUpperCase();
					}
					
					if (respconta.equals("S")) {
						
						ex57_ContaBancaria b = getId(id-1);
						
						System.out.println("\nDigite a sua agência bancária: ");
						b.SetAgencia(ler.next());
						
						System.out.println("Digite a sua conta bancária: ");
						b.SetNumero(ler.next());
						
						System.out.println("Digite seu saldo: ");
						b.setSaldo(ler.nextDouble());
						
					}					
				}
				
				if (opcao == 3) {
					
					for(ex57_Cliente a: listaCliente) {
						
						System.out.println(a.exibirDadosCliente());
						
						if (a.getConta() == null) {
							System.out.println("Cliente não possui conta bancária cadastrada.");
						}
						
						else {
							System.out.println(a.exibirDadosConta());
						}
					}
					
					System.out.println("Digite o ID do cliente que deseja excluir o cadastro: ");
					id = ler.nextInt();
					
					ex57_Cliente a = listaCliente.get(id-1);
					
					System.out.println("Tem certeza que deseja excluir este cliente? (S ou N) ");
					System.out.println(a.exibirDadosCliente());
					confirmacao = ler.next().toUpperCase();
					
					while (!confirmacao.equals("S") && !confirmacao.equals("N")) {
						System.out.println("\nResposta Inválida \n");
						System.out.println("Tem certeza que deseja excluir este cliente? (S ou N) ");
						System.out.println(a.exibirDadosCliente());
						confirmacao = ler.next().toUpperCase();
					}
					
					if (confirmacao.equals("S")) {
						listaCliente.remove(id-1);
					}
					
					else {
						iniciar = "S";
						continue;
					}
					
					System.out.println("\nCliente excluido com sucesso!\n");
					System.in.read();
				}
				
				if (opcao == 4) {
					
					for(ex57_Cliente a: listaCliente) {
						
						System.out.println(a.exibirDadosCliente());
						
						if (a.getConta() == null) {
							System.out.println("Cliente não possui conta bancária cadastrada.");
						}
						
						else {
							System.out.println(a.exibirDadosConta());	
							}
						
					}
					System.in.read();
				}
			}
			
			while (opcao >= 1 && opcao <5);
			
			iniciar = "N";
			System.out.println("Programa Encerrado.");
		}	
	}
}
