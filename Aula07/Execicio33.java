package Aula07;

public class Execicio33 {
    public static void main(String[] args) {
        int[] valores = {2, 3, 4, 5, 7, 9};

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    int aux = valores[i];
                    valores[i] = valores[j];
                    valores[j] = aux;

                }
            }
        }
        for(int valor : valores)
        System.out.print(valor + " ");
    }
}
