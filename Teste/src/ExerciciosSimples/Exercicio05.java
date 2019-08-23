package ExerciciosSimples;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double comp = 0; 
		double larg = 0; 
		double alt = 0;
		double area = 0;
		int caixas;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Qual o comprimento da cozinha? ");
		comp = tecla.nextDouble();
		
		System.out.println("Qual a largura da cozinha? ");
		larg = tecla.nextDouble();
		
		System.out.println("Qual a altura da cozinha? ");
		alt = tecla.nextDouble();

		area = (comp*alt*2) + (larg*alt*2);
		caixas = (int) Math.round(area/1);
		
		System.out.println("Quantidade de caixas de azuleijos para colocar em todas as paredes: " + caixas);
		
	}

}
