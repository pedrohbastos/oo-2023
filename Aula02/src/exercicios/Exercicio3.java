package exercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {                      
			int fatorial = 1;			           
			           
			for (int i = n; i >= 1; i--) {
			                fatorial *= i;
			}
			System.out.println("O fatorial de " + n + " é: " + fatorial);
		}		
	}
}
/*
 * 3) Liste os fatoriais de 1 a 10. Deve ser exibido da seguinte maneira:
 * Fatorial de 1 é : 1 O Fatorial de 2 é : 2 O Fatorial de 3 é : 6
 */