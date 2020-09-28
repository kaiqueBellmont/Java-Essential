package Fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		int raio = 3;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("area = " + area);
	}
}

// Para definir uma variavel em java:
/*
*primeiro o tipo;
*depois o nome
*depois o valor
*
*Definir constantes: Digitar 'final' antes da variavel;
*Nome de constante sempre com letra maíuscula
*
*quando for ter um texto com variavel, usar o + para concatenar, como a "," em C;
*
*/