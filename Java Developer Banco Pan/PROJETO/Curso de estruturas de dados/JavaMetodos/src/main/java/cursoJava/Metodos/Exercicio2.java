package cursoJava.Metodos;

public class Exercicio2 {

    public void MensagemAdequada (double hora) {
        if (hora >= 0 && hora <= 12){
            System.out.println("Agora são "+ hora + " Bom dia!!" );
        }else if (hora > 12 && hora <=18) {
            System.out.println("Agora são "+ hora + " Boa Tarde!!" );

        }else if (hora >18 && hora <= 24) {
            System.out.println("Agora são "+ hora + " Boa Noite!!" );

        }else {
            System.out.println("Agora são "+ hora + " Essa Hora não existe , o dia tem 24 Horas!!" );

        }
    }
}
