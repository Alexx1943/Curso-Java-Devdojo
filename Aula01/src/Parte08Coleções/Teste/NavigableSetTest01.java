package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;
import Parte08Coleções.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneComperetor implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneComperetor());
        Smartphone smartphone = new Smartphone("1234", "Iphone");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(); // Ele organiza de acordo com o comparetor da classe de referencia.
        mangas.add(new Manga(3L, "Pokemon", 2.99, 1));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00, 2));
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99, 1));
        mangas.add(new Manga(2L, "Berserk", 7.25, 0));
        mangas.add(new Manga(1L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(10L, "Aaregon", 9.99, 5));

        for (Manga manga:mangas){
            System.out.println(manga);
        }


    }
}
