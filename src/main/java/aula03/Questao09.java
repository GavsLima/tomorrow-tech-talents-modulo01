package aula03;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var qtdPesoasDeMaior = 0;
        for( int i = 0; i < 10; i++ ){
            System.out.printf("Digite a idade da %d° pessoa: ", (i + 1));
            var idade = scanner.nextInt();
            if(idade > 18){
                qtdPesoasDeMaior += 1;
            }
        }
        System.out.printf("\nExitem %d pessoas acima de 18 anos", qtdPesoasDeMaior);
    }
}
