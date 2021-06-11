package Aula04;

import javax.swing.JOptionPane;

public class Exercicio29 {

	public static void main(String[] args) {
		/*
		 * Ler vários números e informar quantos números entre 100 e 200 foram
		 * digitados. Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua
		 * execução.
		 */

		int x = 0;
		int cont = 0;
		
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			System.out.println(x);
			
			if (x >= 100 & x <= 200) {
				cont++;
				System.out.println("Posição do número : " + cont);
			}
		} while (x != 0);

	}

}
