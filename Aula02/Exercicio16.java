package Aula02;
import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que leia um n�mero inteiro e o eleve ao quadrado usando o
		 * m�todo double Math.pow(base, expoente), onde base e expoente s�o n�meros
		 * reais.
		 */
			
		 
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
				
		System.out.println(Math.pow(a, 2));
	}

}
