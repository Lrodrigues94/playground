package Aula03;

import javax.swing.JOptionPane;

public class Exercicio23 {

	public static void main(String[] args) {
		
		/*Construir um algoritmo que indique se o número digitado está compreendido
		entre 20 e 90 ou não.*/ 

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A"));
		
		if (a > 20 & a < 90) {
			System.out.println("Número válido " + a);
		}else {
			System.out.println("Número inválido");
		}
	}

}
