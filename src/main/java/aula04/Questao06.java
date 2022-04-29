package aula04;

import java.util.Random;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] gabarito = new int[13];
        int[] numerosApostador = new int[13];
        var acertos = 0;

        for(int i = 0; i < gabarito.length; i++){
            gabarito[i] = random.nextInt(3) + 1;
        }

        for (int i = 0; i < gabarito.length; i++){
            System.out.printf("%d ", gabarito[i]);
        }

        System.out.println("Apostador, digite os números da loteria: ");
        for (int i = 0; i < numerosApostador.length; i++){
            var numero = 0;
            while (numero == 0){
                System.out.printf("Número %d: ", i + 1);
                numero = scanner.nextInt();

                if ((numero < 1) || (numero > 3)){
                    numero = 0;
                    System.out.println("Digite um número entre 1 e 3!");
                }
            }

            numerosApostador[i] = numero;
        }

        for(int i = 0; i < 13; i++){
            if (numerosApostador[i] == gabarito[i]){
                acertos += 1;
            }
        }

        if (acertos == 13){
            System.out.print("\nParabéns você acertou todos os números!");
        }
        else {
            System.out.printf("\nVocê acertou %d números do gabarito!", acertos);
        }
    }
}
