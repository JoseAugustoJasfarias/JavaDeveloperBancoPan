package ExerciciosLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double n1,n2,n3,n4,n5,media;
        Double maior = 0.0;
        int cont = 0;
       ArrayList <Double> notas= new ArrayList<Double>();

        do {
            System.out.println("Digite a " + (cont+1) + " ° nota:");
            notas.add(cont, scan.nextDouble());

            if (notas.get(cont) > maior) {
                maior = notas.get(cont);

            }
            cont ++;
        }while (cont < 5);
        media = maior / 5;

        System.out.println("A maior nota é " + maior);
        System.out.println("A Media  é " + media );

//        System.out.println("Digite a primeira nota:");
//        n1 = scan.nextDouble();
//        System.out.println("Digite a Segunda nota:");
//        n2 = scan.nextDouble();
//        System.out.println("Digite a Terceira nota:");
//        n3 = scan.nextDouble();
//        System.out.println("Digite a Quarta nota:");
//        n4 = scan.nextDouble();
//        System.out.println("Digite a Quinta nota:");
//        n5 = scan.nextDouble();
//
//        media = (n1 + n2 + n3 + n4 + n5) /  5;
//
//        if (n1 > n2){
//            maior = n1;
//        }
//        System.out.println( "A media entre as notas é " + media);

    }
}
