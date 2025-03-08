package Parte14Streams.Test;

import java.util.List;
//O método reduce() em Streams do Java é uma operação terminal que permite realizar uma redução de um fluxo de elementos
// para um único valor, utilizando uma operação binária. Em outras palavras,
// ele pega os elementos de um fluxo e os combina de alguma forma (por exemplo, somando, multiplicando, concatenando, etc.)
// até que reste apenas um único valor.

public class StreamsTest07 {
    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream().reduce((x, y) -> x + y);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));

        System.out.println("----------------------");

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("----------------------");

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("----------------------");

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::max));

    }
}
