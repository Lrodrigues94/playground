package Aula02;
import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {
		
		/*
		 *  Solicite ao usuário que digite seu peso no formato real. Depois imprima “O
		 * peso informado foi “ + peso + “ kg.”.
		 */
		 double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		 System.out.println("O peso informado é :" + " " + peso + "kg");
		 
	}

}
