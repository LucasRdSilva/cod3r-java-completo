package controle;

public class For1 {

	public static void main(String[] args) {

		for(int contador = 1; // Declara��o da vari�vel
				contador <=10; // Express�o
				contador ++) {//Manipula��o da vari�vel controle
			
			System.out.printf("i = %d\n", contador);
			
		}
		
		int x = 2;
		
		for(; x<10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// La�o infinito
//		for(;;) {
//			System.out.println("Fim!");
//		}

	}

}
