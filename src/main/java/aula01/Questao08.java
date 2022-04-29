package aula01;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de km percorridos: ");
        var quilometrosRodados = scanner.nextFloat();
        System.out.print("Digite quantos litros de gasolina foram consumidos: ");
        var gasolinaConsumida = scanner.nextFloat();

        System.out.printf("O consumo médio do carro é de %.2f Km/L" , (quilometrosRodados / gasolinaConsumida));

    }
}
