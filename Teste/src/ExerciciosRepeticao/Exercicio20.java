package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int idade = 0;
		int cont = 0;
		double media = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite uma idade: ");
			idade = tecla.nextInt();
			
			if(idade != 0) {
				
				cont += 1;
				media += idade;
				
			}
			
		}while (idade != 0);
		
		if (cont > 0) {
			System.out.println("A media das idades é: " + media / cont);
		} else {
			 
			System.out.println("Não tem idades para calcular...");
		}

	}

}
