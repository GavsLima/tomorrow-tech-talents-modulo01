package aula06;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saltos[] = new float[5];
        double somaSaltos = 0;

        System.out.print("Digite o nome do atleta: ");
        var nome = scanner.nextLine();

        for (int i = 0; i < saltos.length; i++){
            System.out.printf("Digite a distância do %d° salto: ", i + 1);
            saltos[i] = scanner.nextFloat();
            somaSaltos += saltos[i];
        }

        var piorSalto = saltos[0];
        var melhorSalto = saltos[0];

        for (int i = 1; i < saltos.length; i++){
            if (saltos[i] < piorSalto)
                piorSalto = saltos[i];
            if (saltos[i] > melhorSalto )
                melhorSalto = saltos[i];
        }

        var mediaSaltos = ((somaSaltos - melhorSalto - piorSalto) / 3);

        System.out.printf("\nAtleta: %s \n\n", nome);
        System.out.printf("Primeiro salto: %.2fm \n", saltos[0]);
        System.out.printf("Segundo salto: %.2fm \n", saltos[1]);
        System.out.printf("Terceiro salto: %.2fm \n", saltos[2]);
        System.out.printf("Quarto salto: %.2fm \n", saltos[3]);
        System.out.printf("Quinto salto: %.2fm \n\n", saltos[4]);

        System.out.printf("Melhor salto: %.2fm \n", melhorSalto);
        System.out.printf("Pior salto: %.2fm \n\n", piorSalto);

        System.out.printf("Média dos saltos: %.2fm \n\n", mediaSaltos);
        System.out.println("Resultado final");
        System.out.printf("%s: %.2fm", nome, mediaSaltos);


    }
}
