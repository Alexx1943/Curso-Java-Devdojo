package Parte12Lambdas.Test;

import Parte12Lambdas.Dominio.Anime;
import Parte12Lambdas.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        ArrayList<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Dragon Baal Z", 10), new Anime("One piece", 900)));

//        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, (a1,a2)-> AnimeComparetors.compereByTitle(a1,a2));
        Collections.sort(animeList, AnimeComparetors::compereByTitle);
        Collections.sort(animeList, AnimeComparetors::compereByEpsodies);
        System.out.println(animeList);


    }
}
