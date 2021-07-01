package fundamentos;

public class Inferencia {
	
	double a = 4.5;
	
	public static void main(String[] args) {
		
		double a = 4.5; // variável declarada e incializada na mesma linha
		System.out.println(a);
		
		// a = "..."; - Atribuir valor com tipo diferente do explícito ocasiona um erro.
		
		//Inferência = Definir o tipo pelo valor atribuído (utilizando var).
		//Uma vez definido, não pode ser dado outro tipo de valor.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; - Atribuir valor com tipo diferente do atribuído
		//conforme o valor inicialmente informado, também ocasiona um erro.
		
		double d; // variável declarada
		d = 123.65; // variável foi incializada
		System.out.println(d); // variável foi utilizada
		
		// var e;
		// e = 123.45;
		// Nesse caso, ocorrerá erro pois no momento que é declarada, precisa atribuir valor obrigatoriamente.
		
	}

}
