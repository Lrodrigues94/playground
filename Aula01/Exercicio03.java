package Aula01;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		// Convertendo temperatura de Faihrenheit para Celsius

		double tf = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura (F)"));
		double tc;

		tc = (tf - 32) / 9 * 5;

		JOptionPane.showInternalMessageDialog(null, tc);
	}
}