package Aula04;

import javax.swing.JOptionPane;

public class Exercicio28 {

	public static void main(String[] args) {
		// Entrar com v�rios n�meros positivos
		// e imprimir a m�dia dos n�meros digitados.
		
		double x  = 0;
		int soma = 0;
				
		do{
			 x = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
			 System.out.println( soma+= x);
		}while(x > 0);
		
	}
}
