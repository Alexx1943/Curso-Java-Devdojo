package Parte14Streams.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {

        List<List<String>> escola = new ArrayList<>();
        List<String> professorMatematica = List.of("Wildinei Suanne", "Catarina Santos", "Sandy Carolina");
        List<String> professorPortugues = List.of("Willian", "David", "Harioson");
        List<String> alunos = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        escola.add(professorMatematica);
        escola.add(professorPortugues);
        escola.add(alunos);

        for (List<String> pessoas : escola) { // Forma utilizada antes do Java 8.
            for (String pessoa: pessoas){
                System.out.println(pessoa);
            }
        }
        System.out.println("-------------------------------------------------");

        escola.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
