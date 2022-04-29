package aula03;

public class Questao03 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if((i % 10) == 0){
                System.out.print("Número múltiplo de 10 - ");
            }
            System.out.println(i);
        }
    }
}
