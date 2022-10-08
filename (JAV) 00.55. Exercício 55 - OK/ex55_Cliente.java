package exercicios;

public class ex55_Cliente {
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ex55_ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ex55_ContaBancaria conta) {
		this.conta = conta;
	}

	public int getQtdcontasCliente() {
		return qtdcontasCliente;
	}

	public void setQtdcontasCliente(int qtdcontasCliente) {
		this.qtdcontasCliente = qtdcontasCliente;
	}

		private int id;
		private String nome;
		private int idade;
		private String email;
		private ex55_ContaBancaria conta;
		private int qtdcontasCliente;
		
		ex55_Cliente(){
			
		}
		
		ex55_Cliente(int id, String nome, int idade, String email, ex55_ContaBancaria conta, int qtdcontasCliente) {
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
			return ("Agência: " + this.conta.getAgencia() + " - Conta: " + this.conta.getNumero() + " - Saldo: R$ " + this.conta.getSaldo());
		} 
}