package Aula04;

import javax.swing.JOptionPane;

public class Exercicio30 {

	public static void main(String[] args) {

		/*
		 * Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome
		 * digitado.
		 */

		String nome = "Leonardo";

		do {
			nome = JOptionPane.showInputDialog("Digite um nome");
			System.out.println("O nome exibido é " + nome);
		} while (!nome.equalsIgnoreCase("FIM"));

	}
}
