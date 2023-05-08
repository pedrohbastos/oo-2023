package exercicios;

public class Pessoa {
//	
	private String nome;
	private double altura, peso;
	
//	atribuir valores ao atributo *this - significa que é do atributo da classe
	public void setNome(String nome) {
		if (nome==null) {
			System.out.println ("Nome Invalido");
		}else {
			this.nome = nome;
		}		
	}	
	public String getNome() {
		return nome;
	}

//	ALTURA
	public void setAltura(double altura) {
		this.altura = altura;
	}	
	public double getAltura() {
		return altura;
	}
	
//	PESO
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
		
		}	

	public String resultadoIMC() {
		if (calcularIMC() < 18.5) {
			return "abaixo do peso!";
		} else if (calcularIMC() <= 24.9) {
			return "peso normal!";
		} else {
			return "acima do peso!";
		}
	}
}

