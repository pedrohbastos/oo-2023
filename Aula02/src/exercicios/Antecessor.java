package exercicios;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int atual = ler.nextInt();
		
		int sucessor = atual + 1;
        int antecessor = atual - 1;
		
		System.out.println("Numero atual: " + atual + " Sucessor: " + sucessor+ " Antecessor: " + antecessor);
	}

}
