package Aula02;
import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Crie um algoritmo que leia três palavras, separadamente, e as apresenta na tela
		na ordem contrária em que foram digitadas, separadas por espaço.*/
		
		String nome1 = JOptionPane.showInputDialog("Digite uma palavra");
		String nome2 = JOptionPane.showInputDialog("Digite uma palavra");
		String nome3 = JOptionPane.showInputDialog("Digite uma palavra");
		
		
		
		System.out.println(nome3 + " " +  nome2+ " " + nome1);
		
	}

}
