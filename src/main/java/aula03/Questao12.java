package aula03;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        var nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        var idade = scanner.nextInt();
        System.out.print("Digite o salário: ");
        var salario = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite o sexo: ");
        var sexo = scanner.next().charAt(0);
        System.out.print("Digite o estado civil: ");
        var estadoCivil = scanner.next().charAt(0);
        System.out.println("");

        if(nome.length() > 3){
            System.out.println("Nome: maior que 3 caracteres - True");
        }
        else{
            System.out.println("Nome: maior que 3 caracteres - False");
        }

        if((idade >= 0) && (idade <= 150)){
            System.out.println("Idade: entre 0 e 150 - True");
        }
        else{
            System.out.println("Idade: entre 0 e 150 - False");
        }

        if(salario > 0){
            System.out.println("Salário: maior que 0 - True");
        }
        else{
            System.out.println("Salário: maior que 0 - False");
        }

        if((sexo == 'f') || (sexo == 'm')){
            System.out.println("Sexo: ‘f’ ou ‘m’ - True");
        }
        else{
            System.out.println("Sexo: ‘f’ ou ‘m’ - False");
        }

        if((estadoCivil == 's') || (estadoCivil == 'c') || (estadoCivil == 'v') || (estadoCivil == 'd')){
            System.out.println("Estado civil: ‘s’, ‘c’, ‘v’, ‘d’ - True");
        }
        else{
            System.out.println("Estado civil: ‘s’, ‘c’, ‘v’, ‘d’ - False");
        }
    }
}
