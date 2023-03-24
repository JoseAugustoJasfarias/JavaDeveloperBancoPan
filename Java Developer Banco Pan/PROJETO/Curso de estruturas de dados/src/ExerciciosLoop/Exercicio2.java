package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double nota ;

        while (true) {

            System.out.println("Digite uma nota entre 1 e 10:");
            nota = scan.nextDouble();

            if ((nota < 0) || (nota > 10)) {
                System.out.println("Digite uma nota válida.");
            } else  break;
        }
    }
}
