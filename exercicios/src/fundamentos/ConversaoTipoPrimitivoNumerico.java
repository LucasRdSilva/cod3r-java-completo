package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //Impl�cito.
		System.out.println(a);
		
		float b = (float) 1.123456788888; // Expl�cito
		//Ciente de que haver� perda de informa��es (Cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //expl�cita (cast)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //expl�cita (cast)
		System.out.println(f);
	}

}
