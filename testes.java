package Fundamentos;

import java.util.Scanner;

public class testes {
	public static void main(String[] args) {
		//Aqui tem que declarar o scanner + nome da entrada = new Scanner(System.in);
		//Est� inicializando o scanner, depois tem que fechar.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este � um programa que resolver equa��es de 2� grau.");
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.println("Digite o valor de a:");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de b:");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de c");
		int c = entrada.nextInt();
		
		final int delta = (b * b) - 4 * a * c;
		
		final int x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
		System.out.println(x1);
		
		final int x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
		
		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
		System.out.println("\nO delta �: " + delta);
		System.out.println("O Valor de X'  � :" + x1);
		System.out.println("O Valor de X'' � :" + x2);
		
		entrada.close();
		
	}
}
