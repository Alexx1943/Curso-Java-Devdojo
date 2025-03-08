package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest08 {
    private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99),
            new LightNovel("Cruzada", 3.75),
            new LightNovel("O Defensor", 1.99),
            new LightNovel("A outra historia americana", 4.00),
            new LightNovel("Carga explosiva", 10.90),
            new LightNovel("O poderoso chefão", 0.90),
            new LightNovel("Carga explosiva2", 3.00)
    ));

    public static void main(String[] args) {

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3 )
                .reduce(Double::sum).ifPresent(System.out::println);

        double sum = lightNovels.stream() // Forma recomendada.
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);


    }

}
