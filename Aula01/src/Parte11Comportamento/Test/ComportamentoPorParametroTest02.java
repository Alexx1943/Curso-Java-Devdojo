package Parte11Comportamento.Test;

import Parte11Comportamento.Interface.CarPreicare;
import Parte11Comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("green", 1998), new Car("black", 2005), new Car("white", 2000), new Car("green", 2020));


    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPreicare() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenCar = filter(cars,car -> car.getColor().equals("green")); // Forma mais recomendada.
        List<Car> redCar = filter(cars,car -> car.getColor().equals("black"));
        List<Car> carByYear = filter(cars, car -> car.getYear() <= 2025);
        System.out.println(greenCar);
        System.out.println(redCar);
        System.out.println(carByYear);


    }
    private static List<Car> filter(List<Car> cars, Predicate<Car> carPreicare){
        List<Car> filterCar = new ArrayList<>();
        for (Car car: cars){
            if (carPreicare.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}
