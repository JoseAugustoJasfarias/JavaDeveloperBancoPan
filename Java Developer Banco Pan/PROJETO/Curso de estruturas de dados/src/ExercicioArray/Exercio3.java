package ExercicioArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] consoantes = new String[6];


        int count = 0;
        int qtdConsoante =0;
        do {
            System.out.print("Digite uma letra:");
            String letra = in.nextLine();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdConsoante ++;

            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante: consoantes ) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes foi "+ qtdConsoante);
    }
}
