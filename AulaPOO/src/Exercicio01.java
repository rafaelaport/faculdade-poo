import java.util.Scanner;

public class Exercicio01 {

	//Constante 
	static final double PI = 3.14;
	
	public static void main(String[] args) {

		//Declaração e inicialização de variáveis 
		double raio, area;
		raio = 0;
		area = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe o raio do círculo:");
		raio = tecla.nextDouble();
				
		//Processamento de dados 
		area = PI * Math.sqrt(raio);
		
		//Saída da informação 
		System.out.println("A área do círculo é: " + area);
		
	}

}
