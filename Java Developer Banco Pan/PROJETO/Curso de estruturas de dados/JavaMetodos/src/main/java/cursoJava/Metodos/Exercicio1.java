package cursoJava.Metodos;


public class Exercicio1 {

    public Double CalcularSoma(double a, double b){
        double soma = a + b;

        System.out.println("==================");
        System.out.printf("O valor " + a + " + " + b + " =%.2f " , soma);
        System.out.println("==================");

        return soma ;
    }
    public Double CalcularSubtracao(double a, double b){

        double subtracao = a - b;

        System.out.println("==================");
        System.out.printf("O valor " + a + " - " + b + " = %.2f " , subtracao);
        System.out.println("==================");

        return subtracao ;
    }
    public Double CalcularMultiplicacao(double a, double b){

        double multiplicacao = a * b;

        System.out.println("==================");
        System.out.printf("O valor " + a + "x " + b + " = " + String.format("%.2f" ,multiplicacao) );
        System.out.println("==================");

        return multiplicacao ;
    }
    public Double CalcularDivisao(double a, double b){

        double divisao = a / b;

        System.out.println("==================");
        System.out.printf("O valor " + a + "/ " + b + " = %.2f", divisao);
        System.out.println("==================");

        return divisao ;
    }
    public void AmostraCalculos(){
        CalcularSoma(5 ,8);
        CalcularSubtracao(50, 99);
        CalcularMultiplicacao(7, 88);
        CalcularDivisao(4668,44);

    }



}
