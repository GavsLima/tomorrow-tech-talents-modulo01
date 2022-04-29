package aula01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var taxaJuros = 2;
        System.out.print("Digite o valor desejado para empréstimo: ");
        var valorEmprestimo = scanner.nextFloat();
        System.out.print("Em quantos meses você deseja pagar: ");
        var qtdMeses = scanner.nextInt();

        var valorTotal = (valorEmprestimo * Math.pow((1 + (taxaJuros/100.0)), qtdMeses));

        System.out.printf("O valor total a ser pago será de R$%.2f", valorTotal);
    }
}
