package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,String> aluno = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","14");
        aluno.put("Media","4.5");
        aluno.put("Turma","J.A");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String,String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Marcos");
        aluno2.put("Idade","44");
        aluno2.put("Media","6.5");
        aluno2.put("Turma","M.A");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));


    }
}