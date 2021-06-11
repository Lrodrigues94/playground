package Aula02;
import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
		 * método double Math.pow(base, expoente), onde base e expoente são números
		 * reais.
		 */
			
		 
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				
		System.out.println(Math.pow(a, 2));
	}

}
