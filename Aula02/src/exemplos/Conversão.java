package exemplos;

public class Conversão {

	public static void main(String[] args) {
		//tipos de variáveis primitivos - armazena valores.
		int a = 1000;
		float b = a;
		
		double c = 5.25;
		
		int d = (int)c;
		float e = (float)c;
		
		//inferência, defino o tipo atraves do valor que eu atribuo .
		var f = "Teste";
		var g = 1000;
				
		// & = e
		//|| = ou
		//! = not
		boolean h = !(10==10);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//Se/senão em 1 linha
		int avaliacao = 3;
		String resultado = (avaliacao==3?"Ótimo":avaliacao==2?"Bom":avaliacao==1?"Regular":"Ruim");
		System.out.println(resultado);
		
		if (avaliacao==2) {
			System.out.println("Otimo");
		} else if(avaliacao==2){
			System.out.println("Bom");
		} else if(avaliacao==1) {
			System.out.println("Relugar");
		}else {
			System.out.println("Ruim");
		}
		
	}

}
