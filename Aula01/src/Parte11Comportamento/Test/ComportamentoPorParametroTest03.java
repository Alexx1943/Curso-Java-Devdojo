package Parte11Comportamento.Test;

import Parte11Comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = List.of(new Car("green", 1998), new Car("black", 2005), new Car("white", 2000), new Car("green", 2020));


    public static void main(String[] args) {

        List<Car> carByColorGreen = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(carByColorGreen);
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filterNumber = filter(num, number -> number % 2 == 0);
        List<Integer> filterNumber2 = filter(num, number -> number % 2 != 0);
        System.out.println("Numeros pares: " + filterNumber);
        System.out.println("Numeros impares: " + filterNumber2);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterByT = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                filterByT.add(e);
            }
        }
        return filterByT;


    }
}
