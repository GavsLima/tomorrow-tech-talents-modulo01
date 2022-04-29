package aula01;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        var valor = scanner.nextFloat();

        System.out.printf("O valor da prestação ficará R$%.2f", valor/5 );

    }
}
