package controle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 1.3;

		if (nota >= 9.0)
			// ; - Bug no c�digo que impede de ser interpretado como um bloco de condi��o
		{
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera !!!");

		}

	}

}
