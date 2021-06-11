package Aula01;
import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String []args) {
		
		//Calculando juros compotos 
		// FV - PV x ( 1+i )n
		
		
		double pv = Double.parseDouble(JOptionPane.showInputDialog("Valor Atual"));
		double i = Double.parseDouble(JOptionPane.showInputDialog("Taxa"));;
		double n = Double.parseDouble(JOptionPane.showInputDialog("Tempo"));;
		
		double fv = pv * Math.pow((1 + i /100), n);
		
		JOptionPane.showMessageDialog(null, "FV = " + fv);
	}
}
