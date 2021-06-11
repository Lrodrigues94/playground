package Aula03;

import javax.swing.JOptionPane;

public class Exercicio19 {
	public static void main(String[] args) {
		// Construir um algoritmo que leia dois valores
		// numéricos inteiros e efetue a adição;
		// caso o resultado seja maior que 10, apresentá-lo.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		int soma = a + b;

		if (soma > 10) {
			System.out.println("O número digitado é " + soma);
		}
	}
}
