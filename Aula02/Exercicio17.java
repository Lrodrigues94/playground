package Aula02;
import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {
		
		/*
		 * Crie um algoritmo que leia três strings por meio do JOptionPane e escreva a
		 * soma do comprimento destas strings.
		 */
		
		String a = JOptionPane.showInputDialog("Digite uma palavra");
		String b = JOptionPane.showInputDialog("Digite uma palavra");
		String c = JOptionPane.showInputDialog("Digite uma palavra");
		
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		
		System.out.println(a.length() + b.length() + c.length());
	
		
	}

}
