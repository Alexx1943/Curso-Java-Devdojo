package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Manga;
import Parte08Coleções.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneComperetor implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}



public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneComperetor());
        Smartphone smartphone = new Smartphone("1234", "Iphone");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); // Ele organiza de acordo com o comparetor da classe de referencia.
        mangas.add(new Manga(3L, "Pokemon", 2.99, 1));
        mangas.add(new Manga(5L, "Helsing ultimete", 5.00, 2));
        mangas.add(new Manga(4L, "Dragon ball Z", 0.99, 1));
        mangas.add(new Manga(2L, "Berserk", 7.25, 0));
        mangas.add(new Manga(1L, "Attack on titan", 9.99, 5));
        mangas.add(new Manga(10L, "Aaregon", 9.99, 5));

        for (Manga manga:mangas) { //descendingSet() = Inverte a ordem
            System.out.println(manga);
        }
Manga yuyu = new Manga(11L, "yuyu hakusho", 2.99,5);
// lower < Chama o de menor valor.
// floor <= Chama o quem tem o mesmo valor.
// higer > Chama o de maior valor.
// ceilinng >= leva em consideração o valor que foi passado.

        System.out.println("-------------------------------------------------------------");

        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("-------------------------------------------------------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // Lista e remove o primeiroobjeto da lista.
        System.out.println(mangas.pollLast()); // Lista e remove o ultimo objeto da lista.
        System.out.println(mangas.size());



    }
}
