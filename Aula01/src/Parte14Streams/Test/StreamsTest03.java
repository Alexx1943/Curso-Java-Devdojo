package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsTest03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
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

        Stream<LightNovel> stream = lightNovels.stream(); //Inicializando a stream
        lightNovels.forEach(System.out::println); // Imprimindo a coleção.

        long count = stream.filter(ln -> ln.getPrice() <= 4).count(); // Filtrando a stream baseado no preço e contando os eementos.

        long count1 = lightNovels.stream()
                .distinct() // Eleminando os dados duplicados
                .filter(ln -> ln.getPrice() <= 4) // filtrando baseado no preço.
                .count(); // Contando os elementos

        System.out.println(count);
        System.out.println(count1);


    }
}
