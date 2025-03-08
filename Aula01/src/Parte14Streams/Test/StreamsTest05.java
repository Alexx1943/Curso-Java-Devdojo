package Parte14Streams.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest05 {
    public static void main(String[] args) {

        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] lettler = words.get(0).split(""); //
        System.out.println(Arrays.toString(lettler));

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        System.out.println(collect);

        Stream<String> stream = Arrays.stream(lettler);
        System.out.println(stream);

        List<String> lettler1 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(lettler1);



    }
}
