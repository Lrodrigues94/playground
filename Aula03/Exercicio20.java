package Aula03;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {
		/*
		 * Construir um algoritmo que leia dois n�meros e efetue a adi��o. Caso o valor
		 * somado seja menor ou igual a 20, este dever� ser apresentado subtraindo-se 5.*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero B"));
		int soma = a + b;
		
		if (soma <= 20) {
			System.out.println("O n�mero digitado � " + (soma-5));
		}

	}

}
