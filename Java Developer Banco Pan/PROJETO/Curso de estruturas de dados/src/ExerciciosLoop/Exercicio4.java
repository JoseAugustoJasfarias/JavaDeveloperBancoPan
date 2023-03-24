package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdNumeros ;

        int qtdPares =0;
        int qtdImpares =0;
        int cont = 0;
        int num ;

        System.out.println("Digite quantes numeros quer informar:");
        qtdNumeros = in.nextInt();

        while (cont < qtdNumeros){
            System.out.println("Digite um número:");
            num = in.nextInt();
            if (num % 2 == 0){
                qtdPares++;
            } else {
                qtdImpares++;
            }
            cont ++;
        }
        System.out.println("Tem " + qtdImpares + " números Impares");
        System.out.println("Tem " + qtdPares + " números Pares");
    }
}
