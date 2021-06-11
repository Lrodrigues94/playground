package Aula03;

import javax.swing.JOptionPane;

public class Exercicio24 {

	public static void main(String[] args) {

		/*
		 * Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo
		 * feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso
		 * contrário, imprimir nome e a mensagem: NÃO ACEITA.(Considerar f ou F)
		 */

		String nome = JOptionPane.showInputDialog("Digite o nome :");
		String sexo = JOptionPane.showInputDialog("Digite o sexo :");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade :"));

		if (sexo.equals("feminino") & idade >= 25) {
			System.out.println(nome + " ACEITA");
		} else {
			System.out.println(nome + " NÃO ACEITA");
		}

	}

}
