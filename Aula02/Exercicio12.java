package Aula02;
import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		/*
		 * Crie um algoritmo que leia um n�mero inteiro, armazene-o em uma vari�vel do
		 * tipo int e depois escreva na tela: �O valor do n�mero digitado �: � e o valor
		 * do n�mero.
		 */

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero "));
		
		System.out.println("O valor do n�mero digitado � :" + a);
	}

}
