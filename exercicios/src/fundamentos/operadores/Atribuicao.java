package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3; // Literal
		int b = a; // Variável
		int c = a + b; // Expressão (vários operandos)
		
		c += b; // Simplificação de "c = c + b"
		c -= a; // Simplificação de "c = c- a"
		c *= b; // Simplificação de "c = c * b"
		c /= a; // Simplificação de "c = c / a"
		
		System.out.println(c);
		
		c %= 2; // Simplificação de "c = c% 2", que pode retornar 0 ou 1 (possui ou não possui restos, respectivamente)
		
		System.out.println(c);
		
	}

}
