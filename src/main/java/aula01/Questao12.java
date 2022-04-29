package aula01;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        var valorDoCusto = scanner.nextFloat();
        System.out.print("Digite a porcentagem de lucro desejado: ");
        var porcentagemDeLucro = scanner.nextFloat();

        var valorDoLucro = (valorDoCusto * (porcentagemDeLucro / 100));

        System.out.printf("O valor do produto deverá ser R$%.2f", (valorDoCusto + valorDoLucro) );

    }
}
