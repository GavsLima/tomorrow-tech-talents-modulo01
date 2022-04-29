package aula02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        float[] notas = new float[3];
        float somaNotas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do(a) aluno(a): ");
        var nome = scanner.nextLine();
        System.out.print("Digite a turma : ");
        var turma = scanner.nextLine();

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %d nota: ", i + 1);
            notas[i] = scanner.nextFloat();
        }

        for (int i = 0; i < notas.length; i++){
            somaNotas += notas[i];
        }

        System.out.printf("%s da turma %s ficou com média %.2f", nome, turma, (somaNotas / notas.length));
    }
}
