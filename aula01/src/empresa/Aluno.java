package empresa;

public class Aluno {

	public static void main(String[] args) {
		double nota1=10, nota2=7, nota3=8, nota4=6, media;
		media = (nota1+nota2+nota3+nota4)/4;	
		int avaliacaoCurso = 0;
		System.out.println("A média é: "+ media);
		
		if (media >= 7){
			System.out.println("Aluno Aprovado!");
		}else {
			System.out.println("Aluno Reprovado");
		}		
		
		//TERNÁRIO, ESTRUÇÃO PARA FAZER UM IF EM 1 LINHA
		System.out.println((media >=7 ? "Aprovado" : "Reprovado"));
		
		switch (avaliacaoCurso) {
		case 5:
			System.out.println("Exelente");
			break;
		case 4:
			System.out.println("Bom");
			break;
		case 3:
			System.out.println("Regular");
			break;
		case 2:
			System.out.println("Ruim");
			break;	
		case 1:
			System.out.println("Péssimo");
			break;
			
		default:
			System.out.println("Não respondeu");
			break;
		}
	}

}
