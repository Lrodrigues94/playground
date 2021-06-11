package Aula02;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int cont =1 , r = 0;
		cont = 1;
		
		do {
			r = r + cont;
			cont+=4;
			
		} while(cont <=5);
		System.out.println(r);
		System.out.println(cont);
	}

}
