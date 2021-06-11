package Aula04;

import javax.swing.JOptionPane;

public class Exercicio28 {

	public static void main(String[] args) {
		// Entrar com vários números positivos
		// e imprimir a média dos números digitados.
		
		double x  = 0;
		int soma = 0;
				
		do{
			 x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			 System.out.println( soma+= x);
		}while(x > 0);
		
	}
}
