package aula04;

import java.util.Random;

public class Questao03 {
    public static void main(String[] args) {
        Random random = new Random();
        double[][] numeros = {{1,2,3},{4,5,50},{7,9,8}};;
        double maior = 0;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                if (numeros[i][j] > maior ){
                    maior = numeros[i][j];
                }
            }
        }

        System.out.println(maior);
    }

}
