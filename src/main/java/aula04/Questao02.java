package aula04;

import java.util.Random;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double[][] numero = new double[2][5];

        for(int i = 0; i < numero.length; i++){
            for(int j = 0; j < numero[i].length; j++){
                System.out.print("Digite o número: ");
                numero[i][j] = scanner.nextDouble();
            }
        }

        for(int i = 0; i < numero.length; i++){
            for(int j = 0; j < numero[i].length; j++){
                System.out.printf("%.2f ", numero[i][j]);
            }
        }
    }

}
