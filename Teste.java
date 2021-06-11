import java.util.Scanner;

public class Teste {

	public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();

		for (int i = 1; i <= t; i++) {
			
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();

			System.out.printf("Caso de Teste %d: %d%s" , i, Math.max(n1, Math.max(n2,n3)), i == t ? "" : "\n");
		}
   }
}
