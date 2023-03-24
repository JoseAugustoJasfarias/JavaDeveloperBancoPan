package ExercicioArray;

public class Exercio4 {
    public static void main(String[] args) {

        int[] numero  =  {6,5,7,5,2,3,4};
        int cont = numero.length -1;
        System.out.print("Vetor:");
        for ( int i = 0 ; i <= numero.length-1; i ++){
            System.out.print(numero[i] + " ");
        }

        System.out.print("Vetor Inverso:");
        while ( cont >=0 ){
            System.out.print(numero[cont] + " ");
            cont--;
        }
    }
}
