package aula03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        var peso = scanner.nextFloat();
        System.out.print("Digite sua altura: ");
        var altura = scanner.nextFloat();

        var imc = peso / Math.pow(altura, 2);

        if(imc < 18.5){
            System.out.printf("Seu IMC é %.2f. Isso significa que você está abaixo do peso!", imc);
        }
        else if((imc >= 18.5) && (imc < 25)){
            System.out.printf("Seu IMC é %.2f. Isso significa que você está no peso ideal!", imc);
        }
        else if((imc >= 25) && (imc < 30)){
            System.out.printf("Seu IMC é %.2f. Isso significa que você está acima do peso!!", imc);
        }
        else {
            System.out.printf("Seu IMC é %.2f. Isso significa que você está obeso!", imc);
        }
    }
}
