package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) senten?a; ou {}
		// while(...) senten?a; ou ()
		// for(...; ...; ...) senten?a; ou {}
		
		//do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.print("Voc? precisa falar "
					+ "as palavras m?gicas...\n");
			System.out.print("Quer sair ? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado.");
		entrada.close();
		
	}

}
