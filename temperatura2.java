package Fundamentos;

import java.util.Scanner;

public class temperatura2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este é um programa que converte Celsius  em Fahrenheit");
		//°F = (C x 9/5) + 32
		System.out.println("Digite a temperatura em Celsius :");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Resultado : " + fahrenheit);
		
		entrada.close();
	
	}
}
