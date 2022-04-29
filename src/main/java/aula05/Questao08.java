package aula05;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var qtdPessoasComNoventaQuilos = 0;
        var somaIdades = 0;

        for (int i = 0; i < 7; i++){
            System.out.printf("Digite a idade da %i° pessoa: ", i + 1);
            somaIdades += scanner.nextInt();

            System.out.print("Agora digite o pesso dessa pessoa: ");
            var peso = scanner.nextFloat();

            if (peso >= 90){
                qtdPessoasComNoventaQuilos++;
            }
        }

        System.out.println("O número de pessoas com 90kg ou mais é: " + qtdPessoasComNoventaQuilos);
        System.out.println("a média de idade das pessoas é: " + (somaIdades / 7));
    }
}
