package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {


     Set<Carro> hashSetCarros = new HashSet<>();

      hashSetCarros.add(new Carro("Ford"));
      hashSetCarros.add(new Carro("Ferrari"));
      hashSetCarros.add(new Carro("Zip"));
      hashSetCarros.add(new Carro("Alpha Romeo"));
      hashSetCarros.add(new Carro("Fiat"));

      System.out.println(hashSetCarros);


      Set<Carro>  treeSetCarros = new TreeSet<>();

      treeSetCarros.add(new Carro("Ford"));
      treeSetCarros.add(new Carro("Ferrari"));
      treeSetCarros.add(new Carro("Zip"));
      treeSetCarros.add(new Carro("Alpha Romeo"));
     treeSetCarros.add(new Carro("Fiat Uno"));
     treeSetCarros.add(new Carro("Fusca"));

      System.out.println(treeSetCarros);

    }
}
