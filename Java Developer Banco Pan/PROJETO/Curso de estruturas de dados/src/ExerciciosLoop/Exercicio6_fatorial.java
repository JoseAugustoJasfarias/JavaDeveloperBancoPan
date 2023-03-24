package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio6_fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fatorial ;
        int multiplicacao = 1;

        System.out.println("Digite quantes numeros quer informar:");
        fatorial = in.nextInt();

        for (int i = fatorial; i > 0; i --){
            System.out.println(i +" x ");
            multiplicacao = multiplicacao * i;

        }
        System.out.println("O resultado do Fatorial de " + fatorial + " é = "+ multiplicacao);
    }
}
