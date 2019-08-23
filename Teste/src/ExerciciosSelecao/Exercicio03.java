package ExerciciosSelecao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;

		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite a nota da primeira avaliacao: ");
		nota1 = tecla.nextDouble();
		
		System.out.println("Digite a nota da segunda avaliacao: ");
		nota2 = tecla.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6.0)
			System.out.println("PARABENS! Voce foi aprovado");
	}

}
