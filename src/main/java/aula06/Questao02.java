package aula06;

import java.util.Scanner;

public class Questao02 {
    private static final double PRECO_TINTA = 80;
    private static final double LITROS_LATA_TINTA = 18;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros quadrado da área desejada para pintar: ");
        var area = scanner.nextDouble();

        var litrosDeTinta = area / 3;
        var latasDeTinta = Math.ceil(litrosDeTinta / LITROS_LATA_TINTA);

        System.out.printf("Você precisa comprar %.2f latas de tinta, gastando R$%.2f", latasDeTinta, (PRECO_TINTA * latasDeTinta));

    }
}
