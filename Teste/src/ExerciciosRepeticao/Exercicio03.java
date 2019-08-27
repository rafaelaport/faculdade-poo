package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		double divisao = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		a = tecla.nextInt();
		
		while (b == 0){
			System.out.println("Digite outro valor inteiro: ");
			b = tecla.nextInt();
		}
		
		divisao = a/b;
		System.out.println("A divisao do primeiro valor pelo segundo eh: " + String.format("%5.2f", divisao));

	}

}
