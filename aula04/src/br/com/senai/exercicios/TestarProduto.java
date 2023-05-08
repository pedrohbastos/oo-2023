package br.com.senai.exercicios;

import java.util.Scanner;

public class TestarProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String resposta = "S";

		do {
			System.out.println("Digite a descrição do produto:");
			String descricao = ler.next();
			System.out.println("Digite o valor do produto:");
			double valor = ler.nextDouble();
			System.out.println("Digite a quantidade do produto:");
			int quantidade = ler.nextInt();
			Produto produto = new Produto(descricao, valor, quantidade);
			double icms = produto.calcularIcms();

			System.out.println("Produto: " + produto.getDescricao());
			System.out.println("Valor unitário: " + produto.getValor());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("ICMS: " + icms);
			System.out.println("Deseja continuar (S/N)?");
			resposta = ler.next();
		} while (resposta.equals("S"));
	}

}
