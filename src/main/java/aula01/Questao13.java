package aula01;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de fábrica do carro: ");
        var valorDeFabrica = scanner.nextFloat();

        var porcentagemDistribuidor = (valorDeFabrica * (28/100f));
        var valorDoImposto = (valorDeFabrica * (45/100f));

        System.out.printf("O valor do carro deverá ser R$%.2f", (valorDeFabrica + porcentagemDistribuidor + valorDoImposto) );

    }
}
