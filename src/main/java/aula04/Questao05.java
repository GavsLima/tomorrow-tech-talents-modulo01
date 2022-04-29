package aula04;

import java.util.Random;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numeros = {{1,2,3},{4,5,50},{7,9,8}};;
        var numeroLinha = 1;
        var soma = 0;

        for(int i = 0; i < numeros[numeroLinha].length; i++){
            soma += numeros[numeroLinha][i];
        }

        System.out.printf("A média da linha %d é %.2f", numeroLinha, (float)soma / numeros[numeroLinha].length);
    }
}
