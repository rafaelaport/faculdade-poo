package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double altura = 0
		double maior = 0;
		String nome = '';
		String nome_m = '';
		int num = 0
		
		Scanner tecla = new Scanner(System.in);
		
		while (!nome.toUpperCase().equals("FIM")) {
			System.out.println("Nome: ");
			//nome = tecla;
			
			if(nome.toUpperCase().equals("FIM"){
				
				System.out.println("Total de mocas no concurso: " + num);
				System.out.println("Moca mais alta: " + nome_m);
				System.out.println("Altura: "String.format("%3.2f", maior));
				
			} else {
				System.out.println("Altura: ");
				altura = tecla.nextDouble();
				
				num = num++;
				
				if(altura > maior){
					maior = altura;
					nome_m = nome;
					
				}
			}
		}

	}

}
