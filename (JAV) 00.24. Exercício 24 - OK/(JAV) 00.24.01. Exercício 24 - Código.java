package exercicios;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estciv;
		int estadocivil;
		double tempocasada;
		
		estciv = "";
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Qual seu sexo? (M ou F): ");
		sexo = ler.nextLine();
		
		System.out.println("Qual seu estado civil?\n1. Solteiro(a)\n2. Casado(a)\n3. Separado(a)\n4. Divorciado(a)\n5. Viúvo(a)");
		estadocivil = ler.nextInt();
		
		if (sexo.equals("F")) {
			switch (estadocivil) {
				case 1:
					estciv = "solteira";
					break;
				case 2:
					estciv = "casada";
					break;
				case 3:
					estciv = "separada";
					break;
				case 4:
					estciv = "divorciada";
					break;
				case 5:
					estciv = "viúva";
					break;
				default:
					System.out.println("Opção Inválida");
					
			}if ( (estadocivil == 2) && (estciv.equals("casada")) ) {
				System.out.println("Há quanto tempo você é casada (em anos)?");
				tempocasada = ler.nextDouble();
				System.out.println(nome + " é do sexo feminino e é casada há " + tempocasada + " anos.");
			}else {
				System.out.println(nome + " é do sexo feminino e é " + estciv );
			}
			
		}else if (sexo.equals("M")) {
			switch (estadocivil) {
			case 1:
				estciv = "solteiro";
				break;
			case 2:
				estciv = "casado";
				break;
			case 3:
				estciv = "separado";
				break;
			case 4:
				estciv = "divorciado";
				break;
			case 5:
				estciv = "viúvo";
				break;
			default:
				System.out.println("Opção Inválida");
				
			}System.out.println(nome + " é do sexo masculino e é " + estciv + ".");
		
		}else {
			System.out.println("Sexo digitado é inválido.");
			System.exit(0);
		}
			
	}
}