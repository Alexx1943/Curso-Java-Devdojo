package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99, 0));
        mangas.add(new Manga(1L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(2L, "Berserk", 7.25, 0));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00, 2));
        mangas.add(new Manga(3L, "Pokemon", 2.99, 0));


    }
}
