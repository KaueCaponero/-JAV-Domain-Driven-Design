package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double figura, base, altura, lado, pi, raio, area, novocalculo;
		
		pi = 3.1416;
		novocalculo = 1;
		
		while (novocalculo == 1) {
			
			System.out.println("Escolha a figura que quer calcular a área (digite o número correspondente): \n1. Triângulo\n2. Quadrado\n3. Retângulo\n4. Círculo\n5. Sair");
			figura = ler.nextDouble();
		
			if (figura == 5) {
				System.out.println("Programa Encerrado");
				System.exit(0);
			
			}else {
			
				if (figura == 1) {
					System.out.println("Digite a base do triângulo: ");
					base = ler.nextDouble();
					System.out.println("Digite a altura do triângulo: ");
					altura = ler.nextDouble();	
				
					area = ( (base * altura) / 2 );
				
					System.out.println("A área do triângulo informado é: " + area + "\n");
				
				}else if (figura == 2) {
					System.out.println("Digite o lado do quadrado: ");
					lado = ler.nextDouble();
				
					area = (Math.pow(lado, 2));
				
					System.out.println("A área do quadrado informado é: " + area + "\n");				
			
				}else if (figura == 3) {
					System.out.println("Digite a base do retângulo: ");
					base = ler.nextDouble();
					System.out.println("Digite a altura do retângulo: ");
					altura = ler.nextDouble();	
					
					area = ( (base * altura) );
					
					System.out.println("A área do retângulo informado é: " + area + "\n");
					
				}else if (figura == 4) {
					System.out.println("Digite o raio do círculo: ");
					raio = ler.nextDouble();
					
					area = ( pi * (Math.pow(raio, 2)) ); 
					
					System.out.println("A área do círculo informado é: " + area + "\n");
					
				}else {
					System.out.println("Opção Inválida.\n");
				}
			}
			
			System.out.println("Deseja efetuar um novo cálculo? (digite o número correspondente)\n1. Sim \n2. Não");
			novocalculo = ler.nextDouble();
				
		}if ( novocalculo == 2 ) {
			System.out.println("Programa encerrado.");
			System.exit(0);
		}else {
			System.out.println("Opção inválida.");
		}
	}
}


