package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//double a = 2.3; //roxo/negrito - palavras reservadas (tipos primitivos no caso)
		String s = "Bom dia X"; //Não primitivo / Não reservado
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem  operador "."
		int b = 3;
		System.out.println(b);
		
	}

}
