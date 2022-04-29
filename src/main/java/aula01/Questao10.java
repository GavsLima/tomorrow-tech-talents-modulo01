package aula01;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var taxaJuros = 0.7;
        System.out.print("Digite o valor depositado: ");
        var valorDepositado = scanner.nextFloat();

        var rendimento = (valorDepositado * (taxaJuros / 100));

        System.out.printf("O dinheiro valerá R$%.2f daqui a um mês", valorDepositado + rendimento );

    }
}
