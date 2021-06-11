package Aula07;

import javax.swing.*;

public class Exercicio32 {
    public static void main(String [] args){

        double[] notas = new double[3];


        for (int i = 0; i < notas.length ; i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        }

        for (double nota : notas){
            System.out.println(nota);
        }
    }
}
