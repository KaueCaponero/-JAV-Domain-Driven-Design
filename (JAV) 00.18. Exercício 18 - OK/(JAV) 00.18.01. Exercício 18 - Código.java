package exercicios;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, v;
		
		System.out.print("Digite o valor da aceleração inicial (m/s2): ");
		a = ler.nextDouble();
		
		System.out.print("Digite o valor da velocidade inicial (m/s): ");
		v0 = ler.nextDouble();
		
		System.out.print("Digite o tempo (s) do percurso: ");
		t = ler.nextDouble();
		
		v = v0 + (a * t);
		
		if (v <= 40) {
			System.out.printf("A sua velocidade é de %.2f. Veículo muito lento", v);
		}else if ( v <= 60) {
			System.out.printf("A sua velocidade é de %.2f. Velocidade permitida", v);
		}else if ( v <= 80) {
			System.out.printf("A sua velocidade é de %.2f. Velocidade de cruzeiro", v);
		}else if (v <= 120) {
			System.out.printf("A sua velocidade é de %.2f. Veículo rápido", v);
		}else {
			System.out.printf("A sua velocidade é de %.2f. Veículo muito rápido", v);
		}
		
	}

}
