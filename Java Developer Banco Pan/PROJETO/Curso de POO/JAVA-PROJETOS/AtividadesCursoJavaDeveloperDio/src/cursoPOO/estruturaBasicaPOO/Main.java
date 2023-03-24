package cursoPOO.estruturaBasicaPOO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Carro carro1 = new Carro();

		 carro1.setCor("Azul");
		 carro1.setModelo("Fusca");
		 carro1.setcapacidadeTanque(60);

		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getcapacidadeTanque());
	}

}
