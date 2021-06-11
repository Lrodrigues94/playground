package Aula01;
import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		
		/*	Crie	um	algoritmo	que	leia	um	número	inteiro	e	o	eleve	ao	quadrado	usando	o	
		método	double	Math.pow(base,	expoente),	onde	base	e	expoente	são	números	
		reais. */
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		
		double soma = Math.pow(numero, 2);
		
		System.out.println(soma);
		
		}
}
