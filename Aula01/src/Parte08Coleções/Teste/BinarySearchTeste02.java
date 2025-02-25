package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(2L, "Dragon ball Z", 0.99));
        mangas.add(new Manga(3L, "Attack on titan", 9.99));
        mangas.add(new Manga(1L, "Berserk", 7.25));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00));
        mangas.add(new Manga(4L, "Pokemon", 2.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga manga1 = new Manga(2L, "Dragon ball Z", 0.99);

        System.out.println(Collections.binarySearch(mangas,manga1));
    }
}
