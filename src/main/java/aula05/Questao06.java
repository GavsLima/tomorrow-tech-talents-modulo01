package aula05;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        var idade = scanner.nextInt();

        if((idade > 17) && (idade < 68))
            System.out.println("Você pode doar sangue");
        else
            System.out.println("Você não pode doar sangue");
    }
}
