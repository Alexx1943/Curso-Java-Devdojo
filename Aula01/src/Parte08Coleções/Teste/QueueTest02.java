package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Consumidor;
import Parte08Coleções.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(3L, "Pokemon", 2.99, 1));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00, 2));
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99, 1));
        mangas.add(new Manga(2L, "Berserk", 7.25, 0));
        mangas.add(new Manga(1L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(10L, "Aaregon", 9.99, 5));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }







    }
}
