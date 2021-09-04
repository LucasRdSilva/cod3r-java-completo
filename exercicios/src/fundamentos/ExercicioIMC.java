package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu peso (em quilos): ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe a sua altura: (em metros): ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		String categoria = imc <= 18.5 ? categoria = "Magreza" : "";
		categoria = imc > 18.5 && imc <= 25 ? categoria = "Normal" : categoria;
		categoria = imc > 25 && imc <= 30 ? categoria = "Sobrepeso" : categoria;
		categoria = imc > 30 && imc <= 40 ? categoria = "Obesidade" : categoria;
		categoria = imc > 40 ? categoria = "Obesidade Grave" : categoria;
		
		System.out.printf("Resultado IMC: %.2f - %s" , imc, categoria);
		
		entrada.close();
	}

}
