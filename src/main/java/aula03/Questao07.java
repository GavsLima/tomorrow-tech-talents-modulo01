package aula03;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        var numero = scanner.nextInt();
        var fatorial = 1;

        for( int i = numero; i > 0; i-- ){
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }
}
