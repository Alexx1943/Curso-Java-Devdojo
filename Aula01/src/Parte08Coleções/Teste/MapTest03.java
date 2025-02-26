package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Consumidor;
import Parte08Coleções.Dominio.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alex");
        Consumidor consumidor2 = new Consumidor("Alex Tavares");

        Manga manga1 = new Manga(4L, "Dragon ball Z", 0.99);
        Manga manga2 = new Manga(1L, "Attack on titan", 9.99);
        Manga manga3 = new Manga(2L, "Berserk", 7.25);
        Manga manga4 = new Manga(5L, "Helsing ultimete", 5.00);
        Manga manga5 = new Manga(3L, "Pokemon", 2.99);


        List<Manga> listaCompras1 = List.of(manga1, manga2, manga3);
        List<Manga> listaCompras2 = List.of(manga4, manga5,manga1);


        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, listaCompras1);
        consumidorManga.put(consumidor2, listaCompras2);


        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println("----------------------------" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }


    }
}
