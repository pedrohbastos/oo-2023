package exercicios;

import java.util.Scanner;

public class TestarVeiculo {
	
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	char resposta = 'S';
	
	do {
		Veiculo veiculo = new Veiculo();
		System.out.println("Digite a placa");
		veiculo.placa = sc.next();
		System.out.println("Digite o tipo de combustivel");
		veiculo.tipoCombustivel = sc.next();		
		System.out.println("Digite o valor do carro");
		veiculo.valor = sc.nextDouble();
		
		System.out.println("O valor do IPVA é: " + veiculo.calcularIPVA());
		System.out.println("Deseja continuar (S/s");		
		resposta = sc.next().charAt(0);		
	}while (resposta=='S' || resposta =='s');
			
	}
}
