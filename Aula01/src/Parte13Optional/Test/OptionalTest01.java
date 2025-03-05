package Parte13Optional.Test;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Idade media");
        Optional<Object> o2 = Optional.ofNullable(null);
        Optional<Object> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> name1 = findName("Alex");
        String empty = name1.orElse("EMPTY");
        System.out.println(empty);
        name1.ifPresent(s -> System.out.println(s.toUpperCase())); // forma para deixar tudo maiusculo.


    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Alex", "Alex Tavares");
        int e = list.indexOf(name);
        if (e != -1) {
            return Optional.of(list.get(e));
        }
        return Optional.empty();
    }

}
