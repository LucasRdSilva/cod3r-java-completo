package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//Ler num 1
		//Ler num 2
		// + - * / %
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		String operacao = JOptionPane.showInputDialog(
				"Informe o símbolo da operação deseja realizar:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
		
		JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + resultado);
	}

}
