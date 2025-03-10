package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

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

        System.out.println(lightNovels.stream().count()); // Contando a quantidade de elementos.
        System.out.println(lightNovels.stream().collect(Collectors.counting())); // Contando utilizando o Collectors.

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); // Filtando o mais caro.
        lightNovels.stream().min(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println); // Filtrando o mais barato.

        System.out.println("-----------------------------------------------------");

        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println); // Filtrando o mais caro utilizando o Collectors
        lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println); // Filtrando o mais barato utilizando o Collectors


        System.out.println("-----------------------------------------------------");


        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        System.out.println("-----------------------------------------------------");


        DoubleSummaryStatistics prices = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)); // Forma mais pratica e limpa.
        System.out.println(prices);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);


    }
}
