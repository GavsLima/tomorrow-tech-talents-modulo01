package aula01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário atual: ");
        var salarioAtual = scanner.nextFloat();

        var valorReajuste = salarioAtual * 0.07;

        var salarioComReajuste = salarioAtual + valorReajuste;

        System.out.printf("Seu salário com o reajuste é de R$%.2f", salarioComReajuste);
    }
}
