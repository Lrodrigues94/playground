package Aula01;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade :"));

		if (idade >= 0 && idade <= 12) {
			System.out.println("voce � Crian�a");

		} else if (idade >= 60) {
			System.out.println("Voce � idoso");

		} else if (idade > 17 && idade <= 59) {
			System.out.println("Voce � adulto");

		} else if (idade > 12 && idade <= 17) {
			System.out.println("Voce � adolescente");

		} else {
			System.out.println("Idade Inv�lida");
		}
	}
}
