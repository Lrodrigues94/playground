package Aula03;

import javax.swing.JOptionPane;

public class Exercicio25 {
	public static void main (String [] args) {
		
		/*Entrar com um número e imprimir uma das mensagens:
			 é múltiplo de 3 ou não é. */
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A"));
		
		if((a % 3) == 0) {
			System.out.println("Multiplo de 3");
		}else {
			System.out.println("Não é Multiplo de 3");
		}
	}
	
}
