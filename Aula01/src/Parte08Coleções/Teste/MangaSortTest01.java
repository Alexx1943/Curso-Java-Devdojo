package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99));
        mangas.add(new Manga(1L, "Attack on titan", 9.99));
        mangas.add(new Manga(2L, "Berserk", 7.25));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00));
        mangas.add(new Manga(3L, "Pokemon", 2.99));

        Collections.sort(mangas, new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-----------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
