package Parte12Lambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LabdaTest02 {
    public static void main(String[] args) {

        List<String> nome = List.of("Alex", "Allan", "Rai");
        List<Integer> map = map(nome, s -> s.length());
        for (Integer e : map) {
            System.out.println(e);
        }


    }

    private static <T, R> List<R> map(List<T> listT, Function<T, R> function) {
        List<R> listR = new ArrayList<>();
        for (T e : listT) {
            R r = function.apply(e);
            listR.add(r);
        }
        return listR;


    }
}
