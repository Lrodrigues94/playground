package Aula04;

import javax.swing.JOptionPane;

public class Exercicio29 {

	public static void main(String[] args) {
		/*
		 * Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram
		 * digitados. Quando o valor 0 (zero) for lido o algoritmo dever� cessar sua
		 * execu��o.
		 */

		int x = 0;
		int cont = 0;
		
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			System.out.println(x);
			
			if (x >= 100 & x <= 200) {
				cont++;
				System.out.println("Posi��o do n�mero : " + cont);
			}
		} while (x != 0);

	}

}
