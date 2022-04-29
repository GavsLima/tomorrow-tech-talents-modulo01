package aula01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var cotacaoAtualDolar = 2.5;
        var cotacaoAtualEuro = 3;
        var cotacaoAtualLibra = 3.5;

        System.out.print("Digite o valor em reais: ");
        var valorEmReal = scanner.nextFloat();

        System.out.println("Valor em Dólar: " + valorEmReal * cotacaoAtualDolar);
        System.out.println("Valor em Euro: " + valorEmReal * cotacaoAtualEuro);
        System.out.println("Valor em Libra: " + valorEmReal * cotacaoAtualLibra);
    }
}
