package br.com.senai.exercicios;

import javax.swing.JOptionPane;

public class TestarFuncionario {

	public static void main(String[] args) {
Funcionario funcionario = new Funcionario("Breno", 3000., 0.11, 0.6, 0.);
		
		funcionario.calcularInss(funcionario.getInss());
		funcionario.calcularValorTransporte(funcionario.getValeTransporte());
		
		JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome() +"\n" + "Salario: " +funcionario.getSalario()
										+ "\n" + "INSS: " + funcionario.getInss()
										+ "\n" + "Vale Transporte: " +funcionario.getValeTransporte()
										+ "\n" + "Salario Liquido: " + (funcionario.getSalario()
										- funcionario.calcularInss(funcionario.getInss())
										- funcionario.calcularValorTransporte(funcionario.getValeTransporte())));
		
	}

}
