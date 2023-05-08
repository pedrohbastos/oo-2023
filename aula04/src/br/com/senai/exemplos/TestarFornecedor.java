package br.com.senai.exemplos;

import javax.swing.JOptionPane;

public class TestarFornecedor {

	public static void main(String[] args) {

		Fornecedor fornecedor1 = new Fornecedor("121212122112", "ABC 12345");
		Fornecedor fornecedor2 = new Fornecedor("313313131", "XPTO 123");
		Fornecedor fornecedor3 = new Fornecedor("5454545", "WC 321");
				
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor2.getNome());
		System.out.println(fornecedor3.getNome());
		System.out.println("Total geral de fornecedores: " + Fornecedor.getContador());
		
		JOptionPane
	}

}
