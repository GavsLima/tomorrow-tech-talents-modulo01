package aula03;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        float somaNotas = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.printf("Digite a %d° nota: ", i + 1);
            somaNotas += scanner.nextFloat();
        }

        float media = somaNotas / 4;
        if(media >= 7){
            System.out.println("Aprovado com média " + media);
        }
        else{
            System.out.println("Em recuperação com média " + media);
        }
    }
}
