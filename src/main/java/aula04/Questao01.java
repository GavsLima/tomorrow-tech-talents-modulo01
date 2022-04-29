package aula04;

import java.util.Random;

public class Questao01 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] numeros = new double[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextDouble() * 100;
            System.out.printf("%.2f ", numeros[i]);
        }
    }

}
