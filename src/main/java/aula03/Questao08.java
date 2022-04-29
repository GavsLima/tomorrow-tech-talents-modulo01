package aula03;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        var menorNumero = 1;
        var maiorNumero = 1;
        var somaNumeros = 0;

        for( int i = 0; i < numeros.length; i++ ){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();

            if(menorNumero > numeros[i]){
                menorNumero = numeros[i];
            }
            if(maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
            }
            somaNumeros += numeros[i];
        }

        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: "+ maiorNumero);
        System.out.println("Média: " + (float)somaNumeros / numeros.length);
    }
}
