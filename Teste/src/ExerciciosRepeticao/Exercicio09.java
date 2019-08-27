package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		int resp = 0;
		int cont = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		do {
			System.out.println("Digite a nota da 1a avaliacao: ");
			nota1 = tecla.nextDouble();
			
			System.out.println("Digite a nota da 2a avaliacao: ");
			nota2 = tecla.nextDouble();
			
			media = (nota1 + nota2) / 2;
			
			System.out.println("A media do aluno eh: " + String.format("%3.1f", media));
			
			if (media >= 6){
				
				cont++;
			}
			
			System.out.println("Calcular a media de outro aluno? 1.Sim 2.Nao ");
			resp = tecla.nextInt();
			
		} while(resp == 1);
			
		System.out.println("Quantidade de alunos aprovados: " + cont);

	}

}
