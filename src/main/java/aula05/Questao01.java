package aula05;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de anos que você fuma: ");
        var qtdAnos = scanner.nextInt();

        System.out.print("Digite o número de cigarros fumados por dia: ");
        var qtdCigarrosPorDia = scanner.nextInt();

        System.out.print("Digite o preço do maço de cigarro: ");
        var precoCigarro = scanner.nextFloat();

        var macosPorDia = (qtdCigarrosPorDia / 20f);
        var diasFumando = (365 * qtdAnos);
        var dinheiroGasto = (macosPorDia * precoCigarro * diasFumando);

        System.out.printf("Você gastou R$ %.2f fumando!", dinheiroGasto);
    }
}
