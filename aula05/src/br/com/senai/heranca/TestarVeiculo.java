package br.com.senai.heranca;

public class TestarVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("ABC - 0909", "2343", "Azul", 50000, 9000);
		VeiculoPasseio vp = new VeiculoPasseio("ZXC - 1234", "4321", "Preto", 22500, "Sedan");
		Moto m = new Moto("MNB - 0102", "3434", "Branca", 5000, 125);
		
		System.out.println("Dados caminhão: "+ c.getPlaca() + " | " + c.getValor());
		System.out.println("O valor do IPVA é: "+ c.ValorIPVA());
		
		System.out.println("\nDados veículo passeio: "+ vp.getPlaca() + " | " + vp.getValor());
		System.out.println("O valor do IPVA é: "+ vp.ValorIPVA());
		
		System.out.println("\nDados da moto: "+ m.getPlaca() + " | " + m.getValor());
		System.out.println("O valor do IPVA é: "+ m.ValorIPVA());
		
		
	}

}
