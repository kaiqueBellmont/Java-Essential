package Fundamentos;

import javax.swing.JOptionPane;

public class OptionPane {
	public static void main(String[] args) {
		//quando � option pane o print � no pane;
		// faremos um cast para int tamb�m
		
		String valor = JOptionPane.showInputDialog("Informe um numero:");
		int numero = Integer.parseInt(valor);
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
	}
}
