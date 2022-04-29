package aula05;

import java.util.Scanner;

public class Questao02 {
    static final float TAXA_SINDICATO = (float) 0.03;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        var valorHora = scanner.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        var horasTrabalhadas = scanner.nextFloat();

        var salarioBruto = (valorHora * horasTrabalhadas);

        var salarioLiquido = salarioBruto - (salarioBruto * TAXA_SINDICATO);

        if((salarioBruto > 900) && (salarioBruto <= 1500)){
            salarioLiquido -= (salarioBruto * 0.05);
        }
        else if( (salarioBruto > 1500) && (salarioBruto <= 2500) ){
            salarioLiquido -= (salarioBruto * 0.10);
        }
        else {
            salarioLiquido -= (salarioBruto * 0.20);
        }

        System.out.printf("Seu salário líquido será R$ %.2f", salarioLiquido);
    }
}
