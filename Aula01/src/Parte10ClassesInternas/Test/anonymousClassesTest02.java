package Parte10ClassesInternas.Test;

import Parte09Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparaor implements Comparator<Barco>{
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
public class anonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Canoa")));
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return 0;
            }
        });

        for (Barco barco : barcoList) {
            System.out.println(barco);
        }


    }
}
