package aula04;

import java.util.Random;

public class Questao04 {
    public static void main(String[] args) {
        int[] numeros = {5, 5, 5, 4} ;
        var soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
