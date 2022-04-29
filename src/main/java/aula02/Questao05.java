package aula02;

import java.util.Scanner;

public class Questao05 {
    static final float KILOMETRO_POR_LITRO = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem em horas: ");
        var tempo = scanner.nextFloat();
        System.out.print("Digite a velocidade média do carro: ");
        var velocidade = scanner.nextFloat();

        var distancia = tempo * velocidade;

        var litrosUsados = distancia / KILOMETRO_POR_LITRO;

        System.out.printf("Você precisará de %.2f litros de gasolina. ", litrosUsados);
    }
}
