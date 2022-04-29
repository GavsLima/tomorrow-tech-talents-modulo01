package aula03;

import java.util.Random;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        var vidas = 3;
        var numeroSorteado = random.nextInt(9) + 1;
        System.out.println("Acerte o número sorteado entre 1 e 10" );

        while (vidas > 0){
            System.out.print("\nDigite um núnero: ");
            var numerodigitado = scanner.nextInt();

            if(numerodigitado < numeroSorteado){
                System.out.println("O número digitado foi menor do que o real");
                vidas -= 1;
            }
            else if(numerodigitado > numeroSorteado){
                System.out.println("O número digitado foi maior do que o real");
                vidas -= 1;
            }
            else {
                System.out.println("Parabéns, você acertou!");
                break;
            }
        }
        if(vidas == 0){
            System.out.println("Que pena, você perdeu!");
        }
    }
}
