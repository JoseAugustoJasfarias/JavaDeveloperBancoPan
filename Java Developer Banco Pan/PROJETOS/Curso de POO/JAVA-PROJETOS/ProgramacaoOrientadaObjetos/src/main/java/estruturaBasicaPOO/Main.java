package estruturaBasicaPOO;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Fusca");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.CalcularTotalEncherTanque(5.45));


        Carro carro = new Carro();
        carro.setCapacidadeTanque(152);
        carro.setCor("Preto");
        carro.setModelo("Ferrari");

        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.CalcularTotalEncherTanque(8.9));
    }
}
