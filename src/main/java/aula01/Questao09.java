package aula01;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        var nome = scanner.nextLine();
        System.out.print("Digite a primeira nota:  ");
        var nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota:  ");
        var nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota:  ");
        var nota3 = scanner.nextFloat();

        var media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média de %s é %.2f ", nome, media );

    }
}
