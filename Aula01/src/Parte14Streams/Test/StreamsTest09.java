package Parte14Streams.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Alex ", "Tavares ", "de ", "Oliveira") // Criando uma lista de uma stream
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);


        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.forEach(System.out::print);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
