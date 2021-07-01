package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double calc1 = 32;
		final double calc2 = 5.0/9.0;
		
		double fahrenheint = 86;
		double celsius = (fahrenheint - calc1) * calc2;
		
		System.out.println("Resultado: " + celsius + "°C.");
	}

}
