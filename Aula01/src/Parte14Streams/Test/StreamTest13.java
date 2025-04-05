package Parte14Streams.Test;

import Parte14Streams.Dominio.Categoria;
import Parte14Streams.Dominio.LightNovel;
import Parte14Streams.Dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {

    private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99, Categoria.ACION),
            new LightNovel("Cruzada", 3.75, Categoria.DRAMA),
            new LightNovel("O Defensor", 1.99, Categoria.DRAMA),
            new LightNovel("A outra historia americana", 4.00, Categoria.ROMANCE),
            new LightNovel("Carga explosiva", 10.90, Categoria.ACION),
            new LightNovel("O poderoso chefão", 0.90, Categoria.ROMANCE),
            new LightNovel("Carga explosiva2", 3.00, Categoria.FANTASY),
            new LightNovel("O nome da rosa", 6.00, Categoria.ROMANCE),
            new LightNovel("3 mil milhas para o inferno", 8.00, Categoria.DRAMA),
            new LightNovel("No rastro da bala", 7.99, Categoria.DRAMA)
    ));

    public static void main(String[] args) {


        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> {
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NNORMAL_PRICE; // Criando um operador ternario atraves de uma lambda
        }));

        for (Map.Entry<Promotion, List<LightNovel>> entry : collect.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Map<Categoria, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,
                Collectors.groupingBy(ln -> { // Agrupando por categoria
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NNORMAL_PRICE; // Agrupando por promoção
        })));

        for (Map.Entry<Categoria, Map<Promotion, List<LightNovel>>> entry: collect1.entrySet()){
            System.out.println(entry);
        }


    }
}
