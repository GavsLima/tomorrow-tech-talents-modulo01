package aula06;

import java.util.Scanner;

public class Questao03 {
    private static final double PESO_PERMITIDO = 50;
    private static final double MULTA = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros quadrado da área desejada para pintar: ");
        var peso = scanner.nextDouble();
        double multa = 0;

        var pesoExcedente = peso - PESO_PERMITIDO;
        if (pesoExcedente >= 1){
            multa = (pesoExcedente * MULTA);
        }

        System.out.printf("Você pescou %.0fkg acima do permitido, deve pagar R$%.2f de multa.", pesoExcedente, multa);
    }
}
