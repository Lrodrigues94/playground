package Aula03;

import javax.swing.JOptionPane;

public class Exercicio23 {

	public static void main(String[] args) {
		
		/*Construir um algoritmo que indique se o n�mero digitado est� compreendido
		entre 20 e 90 ou n�o.*/ 

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero A"));
		
		if (a > 20 & a < 90) {
			System.out.println("N�mero v�lido " + a);
		}else {
			System.out.println("N�mero inv�lido");
		}
	}

}
