package exercicios;

public class Veiculo {
	String placa, tipoCombustivel;
	double valor;

	public double calcularIPVA() {
		if (tipoCombustivel.equals("Flex") || tipoCombustivel.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}
}
