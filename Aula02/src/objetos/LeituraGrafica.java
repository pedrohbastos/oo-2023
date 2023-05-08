package objetos;

import javax.swing.JOptionPane;

public class LeituraGrafica {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Digite o primeira nota:");
		String nota2 = JOptionPane.showInputDialog("Digite o segunda nota:");
		double n1 = Double.parseDouble(nota1);
		double n2 = Double.parseDouble(nota2);
		JOptionPane.showMessageDialog(null, (n1 + n2)/2);			
	}

}
