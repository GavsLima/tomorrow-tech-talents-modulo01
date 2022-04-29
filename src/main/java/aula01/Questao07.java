package aula01;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        var numero2 = scanner.nextInt();

        System.out.printf("%d + %d = %d \n", numero1, numero2, (numero1 + numero2));
        System.out.printf("%d - %d = %d \n", numero1, numero2, (numero1 - numero2));
        System.out.printf("%d * %d = %d \n", numero1, numero2, (numero1 * numero2));
        System.out.printf("%d / %d = %.2f \n", numero1, numero2, (float) numero1 / numero2);

    }
}
