package Aula01;
import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String [] args){
		
		
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de lado"));
		int p = 6 * lado;
		double a = (3 * lado * Math.sqrt(3)) /2;
		
		System.out.println("P = " + p);
		System.out.println("A = "+ a);
	}
}