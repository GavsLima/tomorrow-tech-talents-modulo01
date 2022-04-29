package aula05;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdTrue = 0;
        String perguntas[] = {  "Telefonou para a vítima? ",
                                "Esteve no local do crime? ",
                                "Mora perto da vítima? ",
                                "Devia para a vítima? ",
                                "Já trabalhou com a vítima? "};

        System.out.println("Digite 0 para NÃO e 1 para SIM para responder as próximas perguntas!");

        for(int i = 0; i < perguntas.length; i++){
            while (true){
                System.out.print(perguntas[i]);
                var resposta = scanner.nextInt();

                if(resposta == 1){
                    qtdTrue++;
                    break;
                }
                else if(resposta == 0)
                    break;
                else
                    System.out.println("Resposta inválida! \n");
            }
        }

        if(qtdTrue < 2){
            System.out.println("\nInocente");
        } else if(qtdTrue == 2){
            System.out.println("\nSuspeito!");
        }else if ((qtdTrue == 3) || (qtdTrue == 4)){
            System.out.println("\nCúmplice");
        }else if (qtdTrue == 5){
            System.out.println("\nAssassino");
        }
    }
}
