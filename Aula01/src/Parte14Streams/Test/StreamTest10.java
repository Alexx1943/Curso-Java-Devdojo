package Parte14Streams.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 3).limit(10).forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n ->new int[] {n[1], n[0] + n[1]})
                .limit(20)
                .forEach(a -> System.out.println(Arrays.toString(a)));





        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(()->random.nextInt(1,100))
                .limit(15)
                .forEach(System.out::println);

    }
}
