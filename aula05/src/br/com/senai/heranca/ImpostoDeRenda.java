package br.com.senai.heranca;

public abstract class  ImpostoDeRenda {
	protected String nome, email;
	protected double rendimentos;

	public ImpostoDeRenda(String nome, String email, double rendimentos) {
		super();
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	public abstract double imposto() ;
	
}

