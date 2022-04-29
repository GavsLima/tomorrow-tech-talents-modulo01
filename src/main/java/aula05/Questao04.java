package aula05;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade permitida: ");
        var velocidadePermitida = scanner.nextInt();

        System.out.print("Digite a velocidade do veículo: ");
        var velocidadeVeiculo = scanner.nextInt();

        var excessoVelocidade = velocidadeVeiculo - velocidadePermitida;
        var multa = 0;

        if (excessoVelocidade <= 10) {
            multa = 10;
        } else if ((excessoVelocidade > 10) && (excessoVelocidade <= 30)) {
            multa = 100;
        } else if (excessoVelocidade > 30) {
            multa = 200;
        }else{
            multa = 0;
        }

        System.out.printf("O valor da sua multa é R$%d", multa);
    }
}
