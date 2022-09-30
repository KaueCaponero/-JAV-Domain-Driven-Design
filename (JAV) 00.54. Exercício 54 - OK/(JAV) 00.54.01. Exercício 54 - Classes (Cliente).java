package exercicios;

import exercicios.ex54_ContaBancaria;

public class ex54_Cliente {
		public int id;
		public String nome;
		public int idade;
		public String email;
		public ex54_ContaBancaria conta;
		public int qtdcontasCliente;
		
		ex54_Cliente(){
			
		}
		
		ex54_Cliente(int id, String nome, int idade, String email, ex54_ContaBancaria conta, int qtdcontasCliente) {
			this.id = id;
			this.nome = nome;
			this.idade = idade;
			this.email = email;
			this.conta = conta;
			this.qtdcontasCliente = qtdcontasCliente;
		}
		
		public void atualizarEmail(String novoEmail) {
			this.email = novoEmail;
			
		}
		
		public String exibirNomeIdade() {
			return ("Nome: " + this.nome + " - Idade: " + this.idade);
		}
		
		public String exibirDadosConta() {
			return ("Agência: " + this.conta.agencia + " - Conta: " + this.conta.numero + " - Saldo: R$ " + this.conta.saldo);
		} 
}