package Aula02;
import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Crie um algoritmo que leia 3 números que representem uma data,
		 * respectivamente dia, mês e ano. Depois imprima a data usando o formato
		 * dia/mês/ano.
		 */
		
		 int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite  o dia"));
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite  o mês"));
		 int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite  o ano"));
		 
		 System.out.println("A data informada é " + dia + " "+ mes + " " + ano);
	}

}
