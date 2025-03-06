package Parte13Optional.Test;

import Parte13Optional.Dominio.Manga;
import Parte13Optional.Repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepositorio.byTitle("Dragon Bal Z"); // Achando o objeto usando como parametro o titulo, utilisando o memtodo byTitle
        mangaByTitle.ifPresent(m->m.setTitle("Dragon Ball Z 2"));// Se o o titulo estiver correto renomear, caso contrario retorna um opional.empty.
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.byId(1) // Buscando um objeto pelo Id.
                .orElseThrow(IllegalArgumentException::new);// Caso a não encontra o Id, é lançado uma IllegalArgumentException.
        System.out.println(mangaById);


        Manga creatingManga = MangaRepositorio.byTitle("Avatar")// Buscando um titulo, caso não tenha, criar um objeto.
                .orElseGet(() -> new Manga(3, "Avatar", 5)); // criando um objeto.
        System.out.println(creatingManga);


    }


}
