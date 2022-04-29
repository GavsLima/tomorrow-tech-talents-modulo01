package aula01;

import java.util.Scanner;

public class Questao14 {

    static final float PI = (float) 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        var raio = scanner.nextFloat();

        var area = PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.2f m2", area);

    }
}
