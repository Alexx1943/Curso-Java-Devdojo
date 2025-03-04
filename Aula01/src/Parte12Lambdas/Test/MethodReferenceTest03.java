package Parte12Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Alex", "Allan", "Thomas de Aquino"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> nonStringToInteger = Integer::parseInt;
        Integer apply = nonStringToInteger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list,"Alex"));

    }
}
