package Fundamentos;

import java.util.Scanner;

public class temperatura3 {
	
	public static void main(String[] args) {
	// (°F -32) x 5/9 = °C;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Este é um programa que converte Fahrenheit em  Celsius");
	
	System.out.println("Digite a temperatura em fahrenheit :");
	double fahrenheit = entrada.nextDouble();
	
	double celsius = (fahrenheit - 32) * 5/9;
	
	System.out.println("Resultado : " + celsius);
		
	entrada.close();
		
	}
}
