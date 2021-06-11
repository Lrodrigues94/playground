package Aula01;
import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String [] args){
		// Formula de Bhaskara
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta))/ (2 *a);
		double x2 = (-b - Math.sqrt(delta))/ (2 *a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2 );
		
		
	}
	
}