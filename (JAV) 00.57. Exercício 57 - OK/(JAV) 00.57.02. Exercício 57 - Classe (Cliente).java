package exercicios.ex57;

public class ex57_Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ex57_ContaBancaria conta;	
	
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
	public ex57_ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ex57_ContaBancaria conta) {
		this.conta = conta;
	}
	
	ex57_Cliente() {
		
	}
	
	public ex57_Cliente(int id, String nome, int idade, String email, ex57_ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;		
	}
	
	public String exibirNomeIdade() {
		return ("Nome: " + this.nome + " - Idade:" + this.idade);
	}
	
	public String exibirDadosConta() {
		return ("Agência: " + this.conta.getAgencia() + " - Conta: " + this.conta.getNumero() + " - Saldo: " + this.conta.getSaldo());
	}
	
	public String exibirDadosCliente() {
		return ("ID: " + this.id + " - Nome: " + this.nome + " - Idade: " + this.idade + " - Email: " + this.email);
	}

}
