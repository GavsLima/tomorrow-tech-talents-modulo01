package aula02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] praias = new String[5];
        float[] distancias = new float[5];

        int indicePraiaMaisLonge = 0;
        float somaDistancias = 0;

        for (int i = 0; i < praias.length; i ++){
            System.out.print("Digite o nome da praia: ");
            praias[i] = scanner.nextLine();
            System.out.print("Digite a distância para o hotel: ");
            distancias[i] = scanner.nextFloat();

            scanner.nextLine();

            somaDistancias += distancias[i];
            if(distancias[i] > distancias[indicePraiaMaisLonge]){
                indicePraiaMaisLonge = i;
            }
        }

        System.out.println("Praia mais distante: " + praias[indicePraiaMaisLonge]);
        System.out.println("Praias entre 10 e 15 km: ");
        for (int i = 0; i < distancias.length; i++){
            if ( (distancias[i] > 10) && (distancias[i] < 15) ){
                System.out.println(praias[i]);
            }
        }

        System.out.println("Distância média das praias: " + (somaDistancias / distancias.length));
    }
}
