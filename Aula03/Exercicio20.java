package Aula03;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {
		/*
		 * Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
		 * somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B"));
		int soma = a + b;
		
		if (soma <= 20) {
			System.out.println("O número digitado é " + (soma-5));
		}

	}

}
