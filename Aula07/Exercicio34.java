package Aula07;

public class Exercicio34 {
    public static void main(String[] args) {

        calcularFibonacci(5);
    }

    static void calcularFibonacci(int vezes, String separador) {
        for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
            System.out.print(i + separador);

            i = i + j;
            j = i - j;
        }
    }

    static int[] calcularFibonacci(int vezes) {
        int[] resposta = new int[vezes];
        for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
            System.out.print(i + " ");

            i = i + j;
            j = i - j;

            resposta[cont] = i;
        }
        return resposta;
    }
}

