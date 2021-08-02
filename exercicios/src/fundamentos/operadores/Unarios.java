package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // Incrementar simplificado (a = a + 1)
		a--; // Decrementar simplificado (a = a - 1)
		
		++b; // Incrementar simplificado (a = a + 1)
		--b; // Decrementar simplificado (a = a - 1)
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
