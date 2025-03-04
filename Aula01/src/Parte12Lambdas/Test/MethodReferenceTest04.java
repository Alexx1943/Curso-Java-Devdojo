package Parte12Lambdas.Test;

import Parte12Lambdas.Dominio.Anime;
import Parte12Lambdas.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        //criando metodo de criação de objeto, mas não criando um objeto.
        Supplier<AnimeComparetors> newAnime = AnimeComparetors::new; //criando metodo de criação de objeto, mas não criando um objeto.
        AnimeComparetors animeComparetors = newAnime.get(); // criando um objeto.
        ArrayList<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("Dragon Baal Z", 10), new Anime("One piece", 900)));

        animeList.sort(animeComparetors::copereByEpsodiesNoStatic);

        //criando metodo de criação de objeto via lambda, mas não criando um objeto.
        BiFunction<String, Integer, Anime> biFunction1 = (a1, a2) -> new Anime(a1, a2);

        //criando metodo de criação de objeto vai method reference, mas não criando um objeto111.
        BiFunction<String, Integer, Anime> biFunction2 = Anime::new;

        //Criando um objeto utilizando o biFunction1(2)
        Anime nAruto = biFunction2.apply("NAruto", 580);


        animeList.add(nAruto); // Adicionando Naruto a lista.

        // Organizano a lista por quantidade de epsodios, do menor numero para o maior.
        animeList.sort(AnimeComparetors::compereByEpsodies);
        System.out.println(animeList);
    }
}
