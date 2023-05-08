package objetos;

public class TestaConta {

	public static void main(String[] args) {
	 Conta conta1 = new Conta();
	 conta1.numero = 123;
	 conta1.titular = "Pedro";
	 conta1.saldo = 20000;
	 conta1.depositar(100);
	 System.out.println(conta1.sacar(200)?"Saque Efetuado!":"Saldo insuficiente!");
	 
	 Conta conta2 = new Conta();
	 conta2.numero = 321;
	 conta2.titular = "Roni";
	 conta2.saldo = 2000;
	 conta2.depositar(200);
	 System.out.println(conta2.sacar(500) ?"Saque Efetuado!":"Saldo insuficiente!");
	 
	 System.out.println("-----------------------");
	 System.out.println("Número da conta:" + conta1.numero);
	 System.out.println("Titular da conta:" + conta1.titular);
	 System.out.println("Saldo da conta:" + conta1.saldo);
	 System.out.println("-----------------------");
	 System.out.println("Número da conta:" + conta2.numero);
	 System.out.println("Titular da conta:" + conta2.titular);
	 System.out.println("Saldo da conta:" + conta2.saldo);
	}

}
