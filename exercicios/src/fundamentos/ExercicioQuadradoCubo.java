package fundamentos;

import java.util.Scanner;

public class ExercicioQuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int numero = entrada.nextInt();
		
		System.out.printf("Quadrado: %d"
				+ "\nCubo: %d", numero * numero, numero * numero * numero);
		
		entrada.close();
		
	}

}
