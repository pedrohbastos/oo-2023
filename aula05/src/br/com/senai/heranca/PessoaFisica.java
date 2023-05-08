package br.com.senai.heranca;

public class  PessoaFisica extends ImpostoDeRenda {
	private String cpf;

	public PessoaFisica(String nome, String email, double rendimentos, String cpf) {
		super(nome, email, rendimentos);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double imposto() {
		return rendimentos * 0.15;
	}

}
