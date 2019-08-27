package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int n = 0;
		int fatorial = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		n = tecla.nextInt();
		
		if(n == 0){
			
			System.out.println("Fatorial de " + n + " eh: " + 1);

		} else {
			for (int i = 1; i >= n; i++){
				fatorial = fatorial * i;
			}
			
			System.out.println("Fatorial de " + n + " eh: " + fatorial);
		}
		
	}

}
