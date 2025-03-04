package Parte12Lambdas.Service;

import Parte12Lambdas.Dominio.Anime;

public class AnimeComparetors {

    public static int compereByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compereByEpsodies(Anime a1, Anime a2){
        return Integer.valueOf(a1.getEpsodies()).compareTo(a2.getEpsodies());
    }

    public int copereByEpsodiesNoStatic(Anime a1, Anime a2){
        return Integer.valueOf(a1.getEpsodies()).compareTo(a2.getEpsodies());


    }
}
