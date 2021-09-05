package controle;

public class For1 {

	public static void main(String[] args) {

		for(int contador = 1; // Declaração da variável
				contador <=10; // Expressão
				contador ++) {//Manipulação da variável controle
			
			System.out.printf("i = %d\n", contador);
			
		}
		
		int x = 2;
		
		for(; x<10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// Laço infinito
//		for(;;) {
//			System.out.println("Fim!");
//		}

	}

}
