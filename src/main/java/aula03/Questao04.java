package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i ++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        for (int i = numeros.length; i > 0; i--){
            System.out.print(numeros[i - 1]);
            if( i > 1){
                System.out.print(" - ");
            }
        }

    }
}
