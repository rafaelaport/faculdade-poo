package ExerciciosRepeticao;

public class Exercicio19 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 100; i <= 200; i++) {
			soma += i;
			i += 1;
		}
		
		System.out.println("Soma dos pares entre 100 e 200 (inclusive) eh: " + soma);

	}

}
