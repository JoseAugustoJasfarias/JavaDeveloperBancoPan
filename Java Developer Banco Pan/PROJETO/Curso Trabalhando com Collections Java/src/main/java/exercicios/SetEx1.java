package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        /* Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente"..*/

        Scanner in = new Scanner(System.in);

        List<String> respota = new ArrayList<String>();

        int sim =0;
        int nao = 0;

        

        System.out.println("Responda somente S ou N:");
        System.out.println("Telefonou para a vítima?");
        respota.add(in.next());
        System.out.println("Esteve no local do crime?");
        respota.add(in.next());
        System.out.println("Mora perto da vítima?");
        respota.add(in.next());
        System.out.println("Devia para a vítima?");
        respota.add(in.next());
        System.out.println("Telefonou para a vítima?");
        respota.add(in.next());
        System.out.println("Já trabalhou com a vítima?");
        respota.add(in.next());


        System.out.println(respota);


        for ( int i = 0 ; i < respota.size() ; i ++ ) {
            if (respota.get(i).toLowerCase().equals("s")) {
                sim += 1;
            }else {
                nao += 1;
            }

        }

        System.out.println("Sim = " + sim);
        System.out.println("Não = " + nao);

        switch (sim) {
            case 2 :
                System.out.println("Classificada como Suspeita.");
                break;
            case 3 :
            case 4 :
                System.out.println("Classificada como Cúmplice.");
                break;
            case 5 :
                System.out.println("Classificada como Assasina.");
                break;
            default:
                System.out.println("Classificada com Inocente.");
        }
    }
}
