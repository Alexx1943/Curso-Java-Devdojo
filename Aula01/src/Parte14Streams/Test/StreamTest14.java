package Parte14Streams.Test;

import Parte14Streams.Dominio.Categoria;
import Parte14Streams.Dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {

    private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99, Categoria.ACION),
            new LightNovel("Cruzada", 3.75, Categoria.DRAMA),
            new LightNovel("O Defensor", 1.99, Categoria.DRAMA),
            new LightNovel("A outra historia americana", 4.00, Categoria.ROMANCE),
            new LightNovel("Carga explosiva", 10.90, Categoria.ACION),
            new LightNovel("O poderoso chefão", 0.90, Categoria.ROMANCE),
            new LightNovel("Carga explosiva2", 3.00, Categoria.FANTASY)
    ));

    public static void main(String[] args) {


        //Agrupou por categoria
        Map<Categoria, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,
                Collectors.counting()));

        for (Map.Entry<Categoria,Long> entry: collect.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("-------------------------------------------------------");


        // Agrupamento por categoria com o objeto com valor maior, mas com Optional.
        Map<Categoria, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        for (Map.Entry<Categoria,Optional<LightNovel>> entry:collect1.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("-------------------------------------------------------");


        // Agrupamento por categoria com o objeto com valor maior e eliminando o Optional.
        Map<Categoria, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        for (Map.Entry<Categoria, LightNovel> entry: collect2.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("-------------------------------------------------------");


    }
}
