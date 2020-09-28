package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		System.out.println("Este é um programa de conversão de Celsius em Ferenhart");
		// (°F -32) x 5/9 = °C;
		final int Ajuste = -32;
		final double Fator = 5.0 / 9.0;
		double fahrenheit = 89.6;
		double celcius = (fahrenheit + Ajuste) * Fator;
		System.out.println(celcius);
	}
}
