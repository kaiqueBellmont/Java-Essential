package Fundamentos;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o primeiro numero");
		double num1 = entrada.nextDouble();
				
		System.out.println("Informe o segundo numero");
		double num2 = entrada.nextDouble();
		
		double quadrado1 = Math.pow(num1, 2);
		double quadrado2 = Math.pow(num2, 2);
				
		double cubo1 = Math.pow(num1, 3);
		double cubo2 = Math.pow(num2, 3);
		
		System.out.printf("Resultado : %.2f ao quadrado é "+ quadrado1 ,num1);
		System.out.printf("\n");
		System.out.printf("Resultado : %.2f ao quadrado é "+ quadrado2 ,num2);
		
		System.out.printf("\n");
		
		System.out.printf("Resultado : %.2f ao cubo é "+ cubo1 ,num1 );
		System.out.printf("\n");
		System.out.printf("Resultado : %.2f ao cubo é "+ cubo2 ,num2 );
		
		
		
		//System.out.println("Resultado");
		
		
				
		
		entrada.close();
	}
}
