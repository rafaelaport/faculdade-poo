package ExerciciosSelecao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double valor = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = tecla.nextDouble();
		
		if (valor < 0)
			System.out.println("Negativo!");
	
		else
			System.out.println("Positivo!");

	}

}
