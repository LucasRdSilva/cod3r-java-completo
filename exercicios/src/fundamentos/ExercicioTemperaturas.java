package fundamentos;

import java.util.Scanner;

public class ExercicioTemperaturas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
		double valor1 = entrada.nextDouble();
		
		System.out.print("Informe qual a escala de medição da temperatura (C para Celsius, F para Fahrenheit): ");
		String medida = entrada.next();
		
		double resultado = "C".equals(medida) ? valor1 * 1.8 + 32 : (valor1 - 32) / 1.8 ;
		
		System.out.printf("Resultado: %.2f", resultado);
		
		
		entrada.close();
	}

}
