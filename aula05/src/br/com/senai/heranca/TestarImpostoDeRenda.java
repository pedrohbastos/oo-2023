package br.com.senai.heranca;

public class TestarImpostoDeRenda {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Fulano", "F@gmail.com", 90000, "233");
		PessoaJuridica pj = new PessoaJuridica("Xpto S/A", "x@gmail.com", 450000, "234");
		
		System.out.println("O valor à pagar do PF é: "+ pf.imposto());
		System.out.println("O valor à pagar da PJ é: "+ pj.imposto());

	}
}