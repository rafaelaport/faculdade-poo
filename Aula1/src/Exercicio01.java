import java.util.Scanner;

public class Exercicio01 {

	//Constante 
	static final double PI = 3.14;
	
	public static void main(String[] args) {

		//Declara��o e inicializa��o de vari�veis 
		double raio, area;
		raio = 0;
		area = 0;
		
		Scanner tecla = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe o raio do c�rculo:");
		raio = tecla.nextDouble();
				
		//Processamento de dados 
		area = PI * Math.sqrt(raio);
		
		//Sa�da da informa��o 
		System.out.println("A �rea do c�rculo �: " + area);
		
	}

}
