package Aula01;
import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		
		/*	Crie	um	algoritmo	que	leia	um	n�mero	inteiro	e	o	eleve	ao	quadrado	usando	o	
		m�todo	double	Math.pow(base,	expoente),	onde	base	e	expoente	s�o	n�meros	
		reais. */
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
		
		double soma = Math.pow(numero, 2);
		
		System.out.println(soma);
		
		}
}
