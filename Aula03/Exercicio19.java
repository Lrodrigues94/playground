package Aula03;

import javax.swing.JOptionPane;

public class Exercicio19 {
	public static void main(String[] args) {
		// Construir um algoritmo que leia dois valores
		// num�ricos inteiros e efetue a adi��o;
		// caso o resultado seja maior que 10, apresent�-lo.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));

		int soma = a + b;

		if (soma > 10) {
			System.out.println("O n�mero digitado � " + soma);
		}
	}
}
