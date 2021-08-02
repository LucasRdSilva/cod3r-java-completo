package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3; // Literal
		int b = a; // Vari�vel
		int c = a + b; // Express�o (v�rios operandos)
		
		c += b; // Simplifica��o de "c = c + b"
		c -= a; // Simplifica��o de "c = c- a"
		c *= b; // Simplifica��o de "c = c * b"
		c /= a; // Simplifica��o de "c = c / a"
		
		System.out.println(c);
		
		c %= 2; // Simplifica��o de "c = c% 2", que pode retornar 0 ou 1 (possui ou n�o possui restos, respectivamente)
		
		System.out.println(c);
		
	}

}
