package Aula03;

import javax.swing.JOptionPane;

public class Exercicio22 {
	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero X"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Y"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Z"));

		if (x > y && x > z) {
			if (y > z) {
				System.out.println("A ordem crescente é " + z + " " + y + " " + x);
			} else {
				System.out.println("A ordem crescente é  " + y + " " + z + " " + x);
			}
		}

		if (y > x && y > z) {
			if (x > z) {
				System.out.println("A oredem cresente é " + z + " " + x + " " + y);
			} else {
				System.out.println("A ordem crescente é  " + x + " " + z + " " + y);
			}
		}

		if (z > y && z > x) {
			if (x > y) {
				System.out.println("A oredem crescente é " + y + " " + x + " " + z);
			} else {
				System.out.println("A ordem crescente  é " + x + " " + y + " " + z);
			}
		}
	}
}
