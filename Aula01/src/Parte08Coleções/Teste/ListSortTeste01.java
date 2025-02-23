package Parte08Coleções.Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Helsing ultimete");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        mangas.add("Attack on titan");
        mangas.add("Berserk");

        Collections.sort(mangas);


        for (String manga : mangas){
            System.out.println(manga);
        }









    }
}
