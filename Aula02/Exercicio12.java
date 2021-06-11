package Aula02;
import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		/*
		 * Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do
		 * tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor
		 * do número.
		 */

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
		
		System.out.println("O valor do número digitado é :" + a);
	}

}
