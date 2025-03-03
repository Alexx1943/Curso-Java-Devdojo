package Parte11Comportamento.Test;

import Parte11Comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 1998), new Car("black", 2005), new Car("white", 2000), new Car("green", 2020));


    public static void main(String[] args) {

        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByYear(cars, 2025));

    }

    //   private static List<Car> filterCarsGreen(List<Car> cars){ Forma não escalavel, não é muito recomendado.
//        List<Car> greenCar = new ArrayList<>();
//
//       for (Car car : cars) {
//           if (car.getColor().equals("green")){
//               greenCar.add(car);
//           }
//       }
//       return greenCar;
//   }
    private static List<Car> filterByColor(List<Car> cars, String color) { // É  a melhor mais recomendada pela possibilidade de escabilidade.
        List<Car> carByColor = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carByColor.add(car);
            }
        }


        return carByColor;
    }

    private static List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> carByYear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <= year) {
                carByYear.add(car);
            }
        }
        return carByYear;
    }

}
