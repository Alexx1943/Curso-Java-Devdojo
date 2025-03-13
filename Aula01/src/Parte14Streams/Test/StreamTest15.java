package Parte14Streams.Test;

import Parte14Streams.Dominio.Categoria;
import Parte14Streams.Dominio.LightNovel;
import Parte14Streams.Dominio.Promotion;

import java.rmi.MarshalledObject;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {

    private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99, Categoria.ACION),
            new LightNovel("Cruzada", 3.75, Categoria.DRAMA),
            new LightNovel("O Defensor", 1.99, Categoria.DRAMA),
            new LightNovel("A outra historia americana", 4.00, Categoria.ROMANCE),
            new LightNovel("Carga explosiva", 2.50, Categoria.ACION),
            new LightNovel("O poderoso chefão", 0.90, Categoria.ROMANCE),
            new LightNovel("Carga explosiva2", 3.00, Categoria.FANTASY)
    ));

    public static void main(String[] args) {


        Map<Categoria, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.summarizingDouble(LightNovel::getPrice)));

        for (Map.Entry<Categoria, DoubleSummaryStatistics> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("------------------------------------------------------------------------------------------------");

        Map<Categoria, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria,
                        Collectors.groupingBy(ln -> {
                            return ln.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NNORMAL_PRICE;
                        })));

        for (Map.Entry<Categoria, Map<Promotion, List<LightNovel>>> entry : collect1.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
