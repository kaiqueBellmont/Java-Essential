package Fundamentos;

import javax.swing.JOptionPane;

public class OptionPane {
	public static void main(String[] args) {
		//quando é option pane o print é no pane;
		// faremos um cast para int também
		
		String valor = JOptionPane.showInputDialog("Informe um numero:");
		int numero = Integer.parseInt(valor);
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
	}
}
