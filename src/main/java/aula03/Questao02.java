package aula03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numero = 0;

        do {
            System.out.print("Digite um número inteiro, ou digite 0 para parar: ");
            numero = scanner.nextInt();
            if(numero < 0){
                System.out.println("Número negativo!");
            }
            else if(numero > 0){
                System.out.println("Número positivo!");
            }
            else{
                System.out.println("Tchau!");
            }
        }while (numero != 0);
    }
}
