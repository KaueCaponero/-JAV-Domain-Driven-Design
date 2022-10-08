package exercicios;

public class ex56_Produto {
	private int id;
	private String nome;
	private double preco;
	private double qtd;
	private ex56_Categoria categoria;
	
	ex56_Produto() {
		
	}
	
	ex56_Produto(int id, String nome, double preco, double qtd, ex56_Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.categoria = categoria;
	}
	
	public String exibirNomePreco() {
		return ("Nome: " + this.nome + " - Preço: " + this.preco);
	}
	
	public String exibirNomeQtd() {
		return ("Nome: " + this.nome + " - Quantidade: " + this.qtd);
	}
	
	public String exibirIdCategoria() {
		return ("ID da Categoria: " + this.categoria.getId() + " - Nome da Categoria: " + this.categoria.getNome());
	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtd() {
		return qtd;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public ex56_Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ex56_Categoria categoria) {
		this.categoria = categoria;
	}
	

}
