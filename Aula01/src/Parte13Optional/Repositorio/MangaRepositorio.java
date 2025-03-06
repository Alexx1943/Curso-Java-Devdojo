package Parte13Optional.Repositorio;

import Parte13Optional.Dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {

    public static List<Manga> mangas = List.of(new Manga(1, "Dragon Bal Z", 50), new Manga(2, "Naruto", 90));



    public static Optional<Manga> byId(Integer id){
       return findAnything(i->i.getId().equals(id));
    }


    public static Optional<Manga> byTitle(String title){
        return findAnything(t -> t.getTitle().equals(title));
    }

    public static Optional<Manga> findAnything(Predicate<Manga> predicate) {
        Manga mangaList = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                mangaList= manga;
            }
        }
        return Optional.ofNullable(mangaList);
    }


}
