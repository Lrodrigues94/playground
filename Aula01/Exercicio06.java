package Aula01;

import javax.swing.*;

public class Exercicio06 {
	public static void main(String[] args) {
		// Comparar duas variaveis

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor :"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor :"));

		boolean resultado = a == b;

		JOptionPane.showMessageDialog(null, "Iguais ? " + resultado);

		boolean diferente = a != b;
		JOptionPane.showMessageDialog(null, "São Difrentes ? " + diferente);

		boolean primeiroMaiorQueOSegundo = a > b;
		JOptionPane.showMessageDialog(null, " A > B ? " + primeiroMaiorQueOSegundo);

	}
}