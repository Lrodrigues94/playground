package Aula03;

import javax.swing.JOptionPane;

public class Exercicio21 {
	public static void main (String []args) {
		/*Entrar com um n�mero e imprimir a raiz quadrada do n�mero caso ele seja
		positivo e o quadrado do n�mero caso seja negativo.*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		if(a > 0) {
			System.out.println(Math.sqrt(a));
		}else {
			System.out.println(Math.pow(a,2));
		}
	}
}
