package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String valor1 = entrada.nextLine();
		
		System.out.print("\nInforme o segundo salário: ");
		String valor2 = entrada.nextLine();
		
		System.out.print("\nInforme o terceiro salário: ");
		String valor3 = entrada.nextLine();
		
		double salario1 = Double.parseDouble(valor1.replace(',', '.'));
		double salario2 = Double.parseDouble(valor2.replace(',', '.'));
		double salario3 = Double.parseDouble(valor3.replace(',', '.'));
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("Média: %.2f%n", media);
		
		entrada.close();
		
	}

}
