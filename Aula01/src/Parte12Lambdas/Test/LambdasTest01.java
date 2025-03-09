package Parte12Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {

        List<String> nomes = List.of("Alex", "Allan");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Long> numeross = List.of(1L, 2L, 3L);
        List<Character> chars = List.of('A', 'B', 'C');

        forEach(numeros, numero -> System.out.println(numero));
        forEach(nomes, nome -> System.out.println(nome));
        forEach(chars, character -> System.out.println(character));
        forEach(numeross, l-> System.out.println(l));

    }

    private static <T> void forEach(List<T> t, Consumer<T> consumer) {
        for (T e : t) {
            consumer.accept(e);
        }

    }
}
