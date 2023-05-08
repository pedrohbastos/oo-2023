package br.com.senai.exemplos;

public class Setor {
	
	private int codigo;
	private String nome;
	private int qtdeFuncionarios;
	
//	CONSTRUTOR PADRÃO
	public Setor() {
		System.out.println("Construtor vazio");
	}
	
//	 ↓ CONSTRUTOR PADRÃO OU DEFAULT
	public Setor(int codigo, String nome, int qtdeFuncionarios) {
		this.nome = nome;
		this.codigo = codigo;
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	public Setor(String nome) {
		this.nome=nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdedFuncionarios() {
		return qtdeFuncionarios;
	}
	public void setQtdedFuncionarios(int qtdedFuncionarios) {
		this.qtdeFuncionarios = qtdedFuncionarios;
	}	
}


