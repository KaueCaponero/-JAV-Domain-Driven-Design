package exercicios;

import java.util.Scanner;

public class ex53w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ex53_Aluno[] ListaAlunos = new ex53_Aluno[5];		

		int i, indice, j, indicej;

		i = 0;
		j = 0;

		indice = i + 1;

		while (i < 5) {
			ex53_Aluno a = new ex53_Aluno();

			indicej = 1;

			System.out.println(indice + ". Digite seu RA: ");
			a.ra = ler.next();
			System.out.println(indice + ". Digite seu nome: ");
			a.nome = ler.next();
			System.out.println(indice + ". Digite as siglas de suas 6 matérias: ");
			
			String materias[] = new String[6];

			while (j < 6) {				

				System.out.println("Digite a sigla da " + indicej + "ª matéria: ");
				String materia = ler.next();

				materias[j] = materia;
				indicej++;
				j++;
			}
			
			a.materias = materias;

			System.out.println(indice + ". Digite seu período (Manhã / Tarde / Noite): ");
			
			a.periodo = ler.next();

			ListaAlunos[i] = a;
			j = 0;
			indice++;
			i++;
		}

		i = 0;
		j = 0;

		System.out.println("Os alunos do período da noite são: \n");

		while (i < 5) {
			if (ListaAlunos[i].periodo.toUpperCase().equals("NOITE")) {
				System.out.println("RA: " + ListaAlunos[i].ra);
				System.out.println("NOME: " + ListaAlunos[i].nome);
				while (j < 6) {
					System.out.println("MATÉRIA: " + ListaAlunos[i].materias[j]);
					j++;
				}
				System.out.println("PERÍODO: " + ListaAlunos[i].periodo.toUpperCase() + "\n\n");
				j=0;
			}
			i++;
		}
	}
}