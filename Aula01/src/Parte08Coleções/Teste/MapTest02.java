package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Consumidor;
import Parte08Coleções.Dominio.Manga;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alex");
        Consumidor consumidor2 = new Consumidor("Alex Tavares");

        Manga manga1 = new Manga(4L, "Dragon ball Z", 0.99);
        Manga manga2 = new Manga(1L, "Attack on titan", 9.99);
        Manga manga3 = new Manga(2L, "Berserk", 7.25);
        Manga manga4 = new Manga(5L, "Helsing ultimete", 5.00);
        Manga manga5 = new Manga(3L, "Pokemon", 2.99);

        Map<Consumidor, Manga> consumidorManga = new LinkedHashMap<>();

        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
