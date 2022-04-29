package aula02;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[4];
        var somaTotal = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o número: ");
            numeros[i] = scanner.nextInt();

            somaTotal += Math.pow(numeros[i], 2);
        }

        System.out.println("Soma dos quadrados: " + somaTotal);
    }
}
