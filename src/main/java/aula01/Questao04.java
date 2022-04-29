package aula01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        var idade = scanner.nextInt();

        System.out.printf("Você viveu pelo menos %d dias", (idade * 365));
    }
}
