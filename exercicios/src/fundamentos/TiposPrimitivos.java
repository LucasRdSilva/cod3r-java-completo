package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informa��es do funcionario
		
		//tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //Literal Int
		
		//TIpos Num�ricos Reais
		float salario = 11_445.44F; //Literal Float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = true;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
