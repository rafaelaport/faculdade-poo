package ExerciciosSimples;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double pot_lamp, larg_com, comp_com, area_com, pot_total;
		int num_lamp;
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Qual a potencia da lampada (em watts)? ");
		pot_lamp = tecla.nextDouble();
		
		System.out.println("Qual a largura do comodo (em metros)? ");
		larg_com = tecla.nextDouble();
		
		System.out.println("Qual o comprimento do comodo (em metros)? ");
		comp_com = tecla.nextDouble();
		
		area_com = larg_com * comp_com;
		pot_total = area_com * 18;
		num_lamp = (int) Math.round(pot_total / pot_lamp);
		
		System.out.println("Numero de lampadas necessarias para iluminar esse comodo: " + num_lamp);
	}

}
