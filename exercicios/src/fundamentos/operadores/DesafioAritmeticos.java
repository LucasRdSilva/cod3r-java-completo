package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int expressaoA = (int) Math.pow((6*(3+2)), 2); // 150
		expressaoA = expressaoA / (3*2); // 25
		
		int expressaoB = (int) Math.pow((((1-5)*(2-7))/2), 2); //100
		
		int simplificadoA = expressaoA - expressaoB; // 50
		simplificadoA = (int) Math.pow(simplificadoA, 3);
		
		int simplificadoB = (int) Math.pow(10, 3);
		int resultadoA = simplificadoA / simplificadoB;
		
		System.out.println("Meu resultado: " + resultadoA);
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultadoB = superior / inferior;
		
		System.out.println("Resultado correção prof.: " + resultadoB);
		
	}

}
