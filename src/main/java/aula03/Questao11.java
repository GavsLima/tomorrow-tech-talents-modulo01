package aula03;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        var numero2 = scanner.nextInt();

        if(numero1 < numero2){
            for (int i = numero1; i <= numero2; i++){
                System.out.println(i);
            }
        }
        else {
            for (int i = numero2; i <= numero1; i++){
                System.out.println(i);
            }
        }
    }
}
