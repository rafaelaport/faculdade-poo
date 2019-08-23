package ExerciciosSimples;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double temp_f = 0;
		double temp_c = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");		
		temp_f = tecla.nextDouble();
		
		temp_c = ((temp_f - 32) * 5) / 9;
		
		System.out.println("A temperatura em graus Celsius eh: " + String.format("%5.1f", temp_c));
		
		

	}

}
