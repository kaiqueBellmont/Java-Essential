package Fundamentos;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		System.out.println("Teste de IF Else");
		
		
		System.out.println("Digite sua nota :");
		Scanner entrada = new Scanner(System.in);
		double nota = entrada.nextDouble();
		
		
		if (nota >= 6 && nota < 10) {
			System.out.println("Voc� est� aprovado !!!");
			
		} else if (nota < 6 && nota > 3) {
			System.out.println("Voc� est� de recupera��o.");
		} else {
			System.out.println("Reprovado.");
		}
		
	}
	
	
	
	
	
}
