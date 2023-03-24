package one.digitalInnovation;

public class Main {
    public static void main(String[] args) {

          ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("C1");
        minhaListaEncadeada.add("C2");
        minhaListaEncadeada.add("C3");
        minhaListaEncadeada.add("C4");
        minhaListaEncadeada.add("C5");
        minhaListaEncadeada.add("C6");
        minhaListaEncadeada.add("C7");
        minhaListaEncadeada.add("C8");


        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(4);
        minhaListaEncadeada.add(4,"78");
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(4));

    }
}
