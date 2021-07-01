package fundamentos;

public class Inferencia {
	
	double a = 4.5;
	
	public static void main(String[] args) {
		
		double a = 4.5; // vari�vel declarada e incializada na mesma linha
		System.out.println(a);
		
		// a = "..."; - Atribuir valor com tipo diferente do expl�cito ocasiona um erro.
		
		//Infer�ncia = Definir o tipo pelo valor atribu�do (utilizando var).
		//Uma vez definido, n�o pode ser dado outro tipo de valor.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; - Atribuir valor com tipo diferente do atribu�do
		//conforme o valor inicialmente informado, tamb�m ocasiona um erro.
		
		double d; // vari�vel declarada
		d = 123.65; // vari�vel foi incializada
		System.out.println(d); // vari�vel foi utilizada
		
		// var e;
		// e = 123.45;
		// Nesse caso, ocorrer� erro pois no momento que � declarada, precisa atribuir valor obrigatoriamente.
		
	}

}
