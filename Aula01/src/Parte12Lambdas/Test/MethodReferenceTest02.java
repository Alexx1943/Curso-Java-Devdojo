package Parte12Lambdas.Test;

import Parte12Lambdas.Dominio.Anime;
import Parte12Lambdas.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.List;

//Reference to an  instance method of a particular object.
public class MethodReferenceTest02 {
    public static void main(String[] args) {

        ArrayList<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Dragon Baal Z", 10), new Anime("One piece", 900)));

        AnimeComparetors anime = new AnimeComparetors();

         animeList.sort(anime::copereByEpsodiesNoStatic); //Method Reference
         animeList.sort((a1,a2)-> anime.copereByEpsodiesNoStatic(a1,a2)); // Lambda
        System.out.println(animeList);
    }
}
