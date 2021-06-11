package Aula02;
import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int cont = 1;
		double nota = 0;
		double soma = 0;
		double media = 0;

		while (nota != -1) {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota" + cont + ":"));

			if (nota == -1) {
				cont --;
				break;
			}
			
			cont ++;
			soma = soma + nota;
			System.out.println(" A soma das notas é " + soma);
		
			media  = soma / (cont-1);
			
			System.out.println("A media das notas é " + media);

		}
		

	}

}
