package Aula02;
import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		// Calcular m�dia das notas 
		
		double nota;
		int cont = 1;		
		double soma = 0;
		
		// fa�a tal coisa 
		do {
			
			nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota" + cont + ":" ));
			cont++;
			
			if (nota != -1) {
			soma  = soma + nota;
			System.out.println("A soma das notas � " + soma);
			}
			
		}while(nota !=-1);
			System.out.println("Fim do programa");
			
			double media = soma / (cont - 2);
			System.out.println("A m�dia das notas �" + " " + media);
			
		
		// while - equanto condi��o foi verdadeira
	}

}
