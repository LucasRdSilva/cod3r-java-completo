package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //Implícito.
		System.out.println(a);
		
		float b = (float) 1.123456788888; // Explícito
		//Ciente de que haverá perda de informações (Cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (cast)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //explícita (cast)
		System.out.println(f);
	}

}
