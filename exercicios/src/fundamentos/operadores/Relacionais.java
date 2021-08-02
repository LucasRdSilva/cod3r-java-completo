package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		/* Meio não usual de utilizar caractere unicode (não-recomendado)
		
		int a = 97;
		int b = 'a'; -> a = 97
		
		System.out.println(a == b);
		
		System.out.println('\u0097'); 0097 = a
		
		*/
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	}

}
