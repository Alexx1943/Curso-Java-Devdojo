package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 extends Object {
    public static void main(String[] args) {

        Set<Manga> mangas =new LinkedHashSet<>(); // Não aceita elementos duplicados.
        mangas.add(new Manga(1L, "Attack on titan", 9.99));
        mangas.add(new Manga(2L, "Berserk", 7.25));
        mangas.add(new Manga(3L, "Pokemon", 2.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00));


        for (Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
