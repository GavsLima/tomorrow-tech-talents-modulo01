package aula01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        var temperaturaEmCelsius = scanner.nextFloat();

        System.out.println("Temperatura dem em Kelvin: " + (temperaturaEmCelsius + 273.15) );
        System.out.println("Temperatura dem em Fahrenheit: " + (temperaturaEmCelsius * 1.8 + 32) );
        System.out.println("Temperatura dem em Rankine: " + (temperaturaEmCelsius * 1.8 + 32 + 459.67) );
        System.out.println("Temperatura dem em Réaumur: " + (temperaturaEmCelsius * 0.8) );
    }
}
