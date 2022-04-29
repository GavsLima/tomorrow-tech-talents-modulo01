package aula01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de massa em kg: ");
        var massa = scanner.nextFloat();
        System.out.print("Digite a altura em metros: ");
        var altura = scanner.nextFloat();
        System.out.print("Digite o tempo desejado em segundos: ");
        var tempo = scanner.nextFloat();

        var qtdCavalos = Math.ceil((massa * altura / tempo) / 745.6999);

        System.out.printf("A quantidade de cavalos para levantar %.2f quilos a %.2fm de altura em %.2f " +
                "segundos são %.0f cavalos", massa, altura, tempo, qtdCavalos);
    }
}
