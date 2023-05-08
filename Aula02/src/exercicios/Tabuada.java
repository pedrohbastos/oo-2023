package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número: ");
		int numero = ler.nextInt();
		System.out.println("*---Resultado---*");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		ler.close();
		System.out.println("*---------------*");
	}
	
}