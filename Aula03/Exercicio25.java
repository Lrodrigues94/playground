package Aula03;

import javax.swing.JOptionPane;

public class Exercicio25 {
	public static void main (String [] args) {
		
		/*Entrar com um n�mero e imprimir uma das mensagens:
			 � m�ltiplo de 3 ou n�o �. */
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero A"));
		
		if((a % 3) == 0) {
			System.out.println("Multiplo de 3");
		}else {
			System.out.println("N�o � Multiplo de 3");
		}
	}
	
}
