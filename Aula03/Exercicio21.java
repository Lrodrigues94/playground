package Aula03;

import javax.swing.JOptionPane;

public class Exercicio21 {
	public static void main (String []args) {
		/*Entrar com um número e imprimir a raiz quadrada do número caso ele seja
		positivo e o quadrado do número caso seja negativo.*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(a > 0) {
			System.out.println(Math.sqrt(a));
		}else {
			System.out.println(Math.pow(a,2));
		}
	}
}
