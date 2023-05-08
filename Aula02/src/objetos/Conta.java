package objetos;

public class Conta {
	int numero;
	String titular;
	double saldo;

	// Comportamentos
	// void = não tem retorno
	public void depositar(double valor) {
		saldo += valor;		
		System.out.println("Deposito efetuado com sucesso!");		
	}

	// boolean = retorna 1 resposta
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;			
		} else {
			return false;

		}
		
	}

}
