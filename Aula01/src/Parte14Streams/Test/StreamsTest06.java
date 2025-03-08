package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest06 {

    private  static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99),
            new LightNovel("Cruzada", 3.75),
            new LightNovel("O Defensor", 1.99),
            new LightNovel("A outra historia americana", 4.00),
            new LightNovel("Carga explosiva", 10.90),
            new LightNovel("O poderoso chefão", 0.90),
            new LightNovel("Carga explosiva2", 3.00),
            new LightNovel("Carga explosiva2", 3.00)
    ));

    public static void main(String[] args) {

        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 10.00)); // .anyMatch = algum elemento dessa lista é(nesse caso) maior que dez?
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // .allMatch = todos os elementos dessa lista são(nesse caso) maiores que zero?
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0)); // .noneMatch = nenhum elemento dessa lista é(nesse caso) menor que zero?

        lightNovels.stream()
                .filter(ln -> ln.getPrice()>3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);


    }
}
