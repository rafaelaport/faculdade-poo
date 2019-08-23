package ExerciciosSimples;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		double odom_i = 0; 
		double odom_f = 0;
		double litros = 0;
		double valor_t = 0;
		double media = 0;
		double lucro = 0;
		double gasol_l = 1.90;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Marcacao inicial do odometro (Km): ");
		odom_i = tecla.nextDouble();
	
		System.out.println("Marcacao final do odometro (Km): ");
		odom_f = tecla.nextDouble();
		
		System.out.println("Quantidade de combustivel gasto (litros): ");
		litros = tecla.nextDouble();
		
		System.out.println("Valor total recebido (R$): ");
		valor_t = tecla.nextDouble();
		
		media = (odom_f - odom_i) / litros;
		lucro = valor_t - (litros * gasol_l);
		
		System.out.println("Media de consumo em Km/L: " + String.format("%4.1f", media));
		
		System.out.println("Lucro (liquido) do dia: R$" + String.format("%8.2f", lucro));

	}

}
