package Fundamentos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este é um programa que Calcula O IMC.");
		
		System.out.println("Por favor Digite o Peso :");
		double peso = entrada.nextDouble();
		
		System.out.println("Por favor Digite a Altura :");
		double altura = entrada.nextDouble();
		
		final double IMC = peso/ Math.pow(altura, 2);
		
		System.out.println("Seu IMC é de: " + IMC);
		
		
		
		
		
		
		entrada.close();
	}
}
