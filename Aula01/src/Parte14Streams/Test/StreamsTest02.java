package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99),
            new LightNovel("Cruzada", 3.75),
            new LightNovel("O Defensor", 1.99),
            new LightNovel("A outra historia americana", 4.00),
            new LightNovel("Carga explosiva", 10.90),
            new LightNovel("O poderoso chefão", 0.90),
            new LightNovel("Carga explosiva2", 3.00)
    ));

    public static void main(String[] args) {

        List<String> title = lightNovels.stream()// Retorno de uma lista dos elementos filtrados
                .sorted(Comparator.comparing(LightNovel::getTitle))//Ordenar a lista LightNovel por titulo.
                .filter(ln -> ln.getPrice() <= 4)// filtra por preço menor ou igua a 4.
                .limit(3)// Limitar a lista até 3 elementos.
                .map(LightNovel::getTitle) // Extraindo os elementos baseado nas streams anteriores.
                .collect(Collectors.toList()); // Coletar tudo oq foi filtrado e lançar na lista criada no inicio da stream.

        System.out.println(title);


    }
}
