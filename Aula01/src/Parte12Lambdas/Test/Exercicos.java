package Parte12Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercicos {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(List.of(5, 12, 8, 15, 3, 22));
        List<String> nomes = new ArrayList<>(List.of("João", "Maria", "José", "Ana", "Julia"));


        List<Integer> maiorQue10 = filter(numeros, a1 -> a1 >= 10); // Filtrando com lambda
        List<String> letraJJ = filter(nomes, a1 -> a1.contains("J")); // Filtrando com Lambda

        List<String> filterJ = filter(nomes, Exercicos::letraJ); // Fitrando com method reference.
        List<Integer> filterNumero = filter(numeros, Exercicos::isMaior); // Filtrando com method reference.

        System.out.println(maiorQue10);
        System.out.println(letraJJ);

        System.out.println(filterJ);
        System.out.println(filterNumero);


    }

    private static <T> List<T> filter(List<T> list, Predicate<T> a1) {
        List<T> maiorDez = new ArrayList<>();
        for (T e : list) {
            if (a1.test(e)) {
                maiorDez.add(e);
            }
        }
        return maiorDez;

    }

    private static boolean letraJ(String nome) {
        return nome.contains("J");
    }

    private static boolean isMaior(Integer valor) {
        return valor <= 10;
    }
}
