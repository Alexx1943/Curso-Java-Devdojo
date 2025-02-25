package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(3L, "Pokemon", 2.99, 1));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00, 2));
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99, 1));
        mangas.add(new Manga(2L, "Berserk", 7.25, 0));
        mangas.add(new Manga(1L, "Attack on titan", 9.99, 5));

        Iterator<Manga> mangaIterator = mangas.iterator();
        mangas.removeIf(manga -> manga.getQuantidade() == 0); // Alternativa mais viavel.
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
