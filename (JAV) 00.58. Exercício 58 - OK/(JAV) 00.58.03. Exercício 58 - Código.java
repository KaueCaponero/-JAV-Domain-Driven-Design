package exercicios.ex58;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class ex58 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		ArrayList<Produto> listaProduto = new ArrayList<>();
		
		int opcao, id, confid, i;
		String respCategoria, iniciar, confirmacao;
		
		id = 1;
		iniciar = "S";
		
		while (iniciar.equals("S")) {
		
			do {
				System.out.println("==> Sistema da Cadastro de Produtos <==\n");
				System.out.println("1. Incluir Produto\n"
						+ "2. Alterar Produto\n"
						+ "3. Excluir Produto\n"
						+ "4. Exibir Produtos\n"
						+ "5. Sair\n");
				System.out.println("Digite a opção desejada: ");
				opcao = ler.nextInt();
				
				if (opcao == 1) {
					
					Produto produto = new Produto();
					
					produto.setId(id);
					
					System.out.println(id + ". Digite o nome do produto: ");
					produto.setNome(ler.next());
					
					System.out.println(id + ". Digite o preço do produto (R$): ");
					produto.setPreco(ler.nextInt());
					
					System.out.println(id + ". Digite a quantidade do produto (UN): ");
					produto.setQuantidade(ler.nextInt());
					
					System.out.println(id + ". O produto possui alguma categoria? (S ou N)");
					respCategoria = ler.next().toUpperCase();
					
					while (!respCategoria.equals("S") && !respCategoria.equals("N")) {
						System.out.println("Resposta Inválida.");
						System.out.println(id + ". O produto possui alguma categoria? (S ou N)");
						respCategoria = ler.next().toUpperCase();
					}
					
					if (respCategoria.equals("S")) {
						ArrayList<Categoria> listaCategoria = new ArrayList<>();
						Categoria categoria = new Categoria();
						
						categoria.setId(id);
						
						System.out.println("Qual o nome da categoria do produto? ");
						categoria.setNome(ler.next());
						
						produto.setCategoria(categoria);
						listaCategoria.add(categoria);
					}
					
					else {
						produto.setCategoria(null);
					}
					
					listaProduto.add(produto);
					id++;
					System.out.println("Produto Cadastrado com Sucesso!");
					System.out.println("\nTecle ENTER para retornar ao Menu.\n");
					iniciar = "S";
					System.in.read();
				}
				
				else if (opcao == 2) {
					
					System.out.println("Lista de Produtos Cadastrados: ");
					System.out.println("ID NOME PREÇO QUANTIDADE CATEGORIA");
					System.out.println("-- ---- ----- ---------- ---------");
					
					if (listaProduto.size() == 0) {
						System.out.println("\nNenhum produto cadastrado!\n");
						System.out.println("-- ---- ----- ---------- ---------\n");
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();	
						break;
					}
					
					else {
										
						for (Produto produto: listaProduto) {
							
							if (produto.getCategoria() == null) {
								System.out.println(produto.exibirDadosProdutosemCategoria());
							}
								
							else {
								System.out.println(produto.exibirDadosProdutocomCategoria());
							}							
						}
						
						System.out.println("-- ---- ----- ---------- ---------\n");	
						
						System.out.println("Digite o ID do produto que deseja atualizar: ");
						confid = ler.nextInt();
						
						while (confid <= 0 || confid > listaProduto.size()){
							System.out.println("ID Inválido.");
							System.out.println("Digite o ID do produto que deseja atualizar: ");
							confid = ler.nextInt();
						}
						
						for (Produto produto: listaProduto) {
													
							produto = listaProduto.get(confid-1);
							
							System.out.println("ID NOME PREÇO QUANTIDADE CATEGORIA");
							System.out.println("-- ---- ----- ---------- ---------");
							
							if (produto.getCategoria() == null) {
								System.out.println(produto.exibirDadosProdutosemCategoria());
							}
							
							else {
								System.out.println(produto.exibirDadosProdutocomCategoria());
							}
							
							System.out.println("-- ---- ----- ---------- ---------\n");
							
							System.out.println("Tem certeza que deseja atualizar este produto? (S ou N)");
							confirmacao = ler.next().toUpperCase();
							
							while (!confirmacao.equals("S") && !confirmacao.equals("N")) {
								System.out.println("Resposta Inválida.");
								System.out.println("Tem certeza que deseja atualizar este produto? (S ou N)");
								confirmacao = ler.next().toUpperCase();
							}
							
							if (confirmacao.equals("S")) {
								
								System.out.println(confid + ". Digite o novo nome do produto: ");
								produto.setNome(ler.next());
								
								System.out.println(confid + ". Digite o novo preço do produto: ");
								produto.setPreco(ler.nextInt());
								
								System.out.println(confid + ". Digite a nova quantidade do produto: ");
								produto.setQuantidade(ler.nextInt());
								
								System.out.println(id + ". O produto possui alguma categoria? (S ou N)");
								respCategoria = ler.next().toUpperCase();
								
								while (!respCategoria.equals("S") && !respCategoria.equals("N")) {
									System.out.println("Resposta Inválida.");
									System.out.println(id + ". O produto possui alguma categoria? (S ou N)");
									respCategoria = ler.next().toUpperCase();
								}
								
								if (respCategoria.equals("S")) {
									
									if (produto.getCategoria() == null) {
										
										Categoria categoria = new Categoria();
										
										categoria.setId(id);
										
										System.out.println("Qual o nome da categoria do produto? ");
										categoria.setNome(ler.next());
										
										produto.setCategoria(categoria);
									}
								
									else {
									
									Categoria categoria = produto.getCategoria();
									
									categoria.getId();
									
									System.out.println("Qual o nome da categoria do produto? ");
									categoria.setNome(ler.next());
									
									produto.setCategoria(categoria);
									}
								}
								
								else {
									produto.setCategoria(null);
								}
							}
						
						else {
								System.out.println("\nTecle ENTER para retornar ao Menu.\n");
								System.in.read();
								iniciar = "S";
								break;
							}
						
						System.out.println("Produto Atualizado com Sucesso!");
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();
						iniciar = "S";
						break;
						}
					}
				}
				
				else if (opcao == 3) {
					
					System.out.println("Lista de Produtos Cadastrados: ");
					System.out.println("ID NOME PREÇO QUANTIDADE CATEGORIA");
					System.out.println("-- ---- ----- ---------- ---------");
					
					if (listaProduto.size() == 0) {
						System.out.println("\nNenhum produto cadastrado!\n");
						System.out.println("-- ---- ----- ---------- ---------\n");
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();	
						break;
					}
					
					else {
										
						for (Produto produto: listaProduto) {
							
							if (produto.getCategoria() == null) {
								System.out.println(produto.exibirDadosProdutosemCategoria());
							}
								
							else {
								System.out.println(produto.exibirDadosProdutocomCategoria());
							}							
						}
						
						System.out.println("-- ---- ----- ---------- ---------\n");	
						
						System.out.println("Digite o ID do produto que deseja excluir ");
						confid = ler.nextInt();
						
						while (confid <= 0 || confid > listaProduto.size()){
							System.out.println("ID Inválido.");
							System.out.println("Digite o ID do produto que deseja excluir: ");
							confid = ler.nextInt();
						}
						
						for (Produto produto: listaProduto) {
													
							produto = listaProduto.get(confid-1);
							
							System.out.println("ID NOME PREÇO QUANTIDADE CATEGORIA");
							System.out.println("-- ---- ----- ---------- ---------");
							
							if (produto.getCategoria() == null) {
								System.out.println(produto.exibirDadosProdutosemCategoria());
							}
							
							else {
								System.out.println(produto.exibirDadosProdutocomCategoria());
							}
							
							System.out.println("-- ---- ----- ---------- ---------\n");
							
							System.out.println("Tem certeza que deseja excluir este produto? (S ou N)");
							confirmacao = ler.next().toUpperCase();
							
							while (!confirmacao.equals("S") && !confirmacao.equals("N")) {
								System.out.println("Resposta Inválida.");
								System.out.println("Tem certeza que deseja excluir este produto? (S ou N)");
								confirmacao = ler.next().toUpperCase();
							}
							
							if (confirmacao.equals("S")) {
								
								listaProduto.remove(produto);
							}
						
							else {
								System.out.println("\nTecle ENTER para retornar ao Menu.\n");
								System.in.read();
								iniciar = "S";
								break;
							}
						
						System.out.println("Produto Excluído com Sucesso!");
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();
						iniciar = "S";
						break;
						}
					}			
				}
				
				else if (opcao == 4) {
					
					System.out.println("Lista de Produtos Cadastrados: ");
					System.out.println("ID NOME PREÇO QUANTIDADE CATEGORIA");
					System.out.println("-- ---- ----- ---------- ---------");
					
					if (listaProduto.size() == 0) {
						System.out.println("\nNenhum produto cadastrado!\n");
						System.out.println("-- ---- ----- ---------- ---------\n");
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();	
						break;
					}
					
					else {
										
						for (Produto produto: listaProduto) {
							
							if (produto.getCategoria() == null) {
								System.out.println(produto.exibirDadosProdutosemCategoria());
							}
								
							else {
								System.out.println(produto.exibirDadosProdutocomCategoria());
							}							
						}
						
					System.out.println("-- ---- ----- ---------- ---------\n");
					System.out.println("\nTecle ENTER para retornar ao Menu.\n");
					System.in.read();
					iniciar = "S";
					}
				}
				
				else if (opcao == 5) {
					
					System.out.println("Tem certeza que deseja encerrar o programa? (S ou N)");
					confirmacao = ler.next().toUpperCase();
					
					while (!confirmacao.equals("S") && !confirmacao.equals("N")) {
						
						System.out.println("Resposta Inválida.");
						System.out.println("Tem certeza que deseja encerrar o programa? (S ou N)");
						confirmacao = ler.next().toUpperCase();
					}
					
					if (confirmacao.equals("S")) {
						System.out.println("Programa Encerrado.");
						iniciar = "N";
					}
					
					else {
						System.out.println("\nTecle ENTER para retornar ao Menu.\n");
						System.in.read();
					}
				}
				
				else {
					System.out.println("\nOpção Inválida");
					System.out.println("\nTecle ENTER para retornar ao Menu.\n");
					System.in.read();
				}
			}
			
			while (opcao >= 1 && opcao < 5);
		}
	}
}
