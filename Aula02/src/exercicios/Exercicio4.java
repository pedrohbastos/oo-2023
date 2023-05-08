package exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int resposta = 0;
		do {
			Funcionario funcionario = new Funcionario();
			
			funcionario.nome = JOptionPane.showInputDialog("Digite o nome do funcionario:");
			funcionario.telefone = JOptionPane.showInputDialog("Digite telefone do funcionario:");
			funcionario.email = JOptionPane.showInputDialog("Digite o email do funcionario:");
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario:"));
			
			funcionario.aumentarSalario();
			
			JOptionPane.showMessageDialog(null, funcionario.nome + ", telefone:" + funcionario.telefone + ", e-mail:" + funcionario.email
					+ " e seu salário atualizado:" + funcionario.salario);
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirme", JOptionPane.YES_OPTION);
		} while (resposta==0);
	}
}
/*
 * 4) Usando a classe JOptionPane, leia nome, telefone, email e salário do
 * teclado e exiba as informações digitadas na tela com salário com acréscimo de
 * 10%.
 */