package br.com.senai.exercicios;

public class Funcionario {
	private String nome;
	private double salario;
	private double inss;
	private double valeTransporte;
	private double salarioLiquido;
	
	public Funcionario(String nome, double salario, double inss, double valeTransporte, double salarioLiquido) {
		this.nome = nome;
		this.salario = salario;
		this.inss = inss;
		this.valeTransporte = valeTransporte;
		this.salarioLiquido = salarioLiquido;
		
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(double valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	
	public double calcularInss(double valor) {
		inss = salario * 0.11;
		return inss;
	}
	
	public double calcularValorTransporte(double valor) {
		valeTransporte = salario * 0.06;
		return valeTransporte;
	}
	
	public void valorSalarioLiquido(double valor) {
		salarioLiquido = inss + valeTransporte - salario;
	}
	
    
}