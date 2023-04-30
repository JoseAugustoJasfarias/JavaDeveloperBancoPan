package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        /* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/

        Scanner in = new Scanner(System.in);

        List<Double> meses = new ArrayList<Double>();

        double media =0;
        double soma = 0;

        for ( int i = 1 ; i < 7 ; i ++){
            System.out.println("Informe a temperatura para o mês " + (i ) +"° :");
            meses.add( in.nextDouble());

        }
        for ( int i = 0 ; i < meses.size() ; i ++ ) {
            soma += meses.get(i);
        }

        System.out.println(meses);
        System.out.println("A soma das temperaturas é " + soma + "° Celsius.");
        media = soma / meses.size();
        System.out.println("A Media das temperaturas é " + media + "° Celsius.");

        for ( int i = 0 ;  i  < meses.size() ;i  ++ ) {
            if (meses.get(i) > media) {
                switch (i) {
                    case 0 :
                        System.out.println("Janeiro ,temperatura de " + meses.get(i) + "° Celsius");
                        break;
                    case 1 :
                        System.out.println("Fevereiro ,temperatura de " + meses.get(i) + "° Celsius");
                        break;
                    case 2 :
                        System.out.println("Março ,temperatura de " + meses.get(i) + "° Celsius");
                        break;
                    case 3 :
                        System.out.println("Abril ,temperatura de " + meses.get(i) + "° Celsius");
                        break;
                    case 4 :
                        System.out.println("Maio ,temperatura de " + meses.get(i) + "° Celsius");
                        break;
                    case 5 :
                        System.out.println("Junho ,temperatura de " + meses.get(i) + "° Celsius");
                        break;

                    default:
                        System.out.println("Não teve mês maior que a media de " + media + "° Celsius");
                }
            }
        }

    }
}
