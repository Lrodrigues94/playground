package Aula06;

public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 10; linha >= 0; linha--) {
			for (int coluna = 10; coluna >= 0; coluna--) {
				if(coluna < linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
