package Parte14Streams.Test;

import Parte14Streams.Dominio.Categoria;
import Parte14Streams.Dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

    private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99, Categoria.ACION),
            new LightNovel("Cruzada", 3.75, Categoria.DRAMA),
            new LightNovel("O Defensor", 1.99, Categoria.DRAMA),
            new LightNovel("A outra historia americana", 4.00, Categoria.ROMANCE),
            new LightNovel("Carga explosiva", 10.90, Categoria.ACION),
            new LightNovel("O poderoso chefão", 0.90, Categoria.ROMANCE),
            new LightNovel("Carga explosiva2", 3.00, Categoria.FANTASY)
    ));

    public static void main(String[] args) {

//        // Como era feito antigamente para filtrar.
//        Map<Categoria, List<LightNovel>> categoriaListMap = new HashMap<>();
//        List<LightNovel> fantasy = new ArrayList<>();
//        List<LightNovel> acion = new ArrayList<>();
//        List<LightNovel> drama = new ArrayList<>();
//        List<LightNovel> romance = new ArrayList<>();
//
//        for (LightNovel lightNovel : lightNovels) {
//            switch (lightNovel.getCategoria()){
//                case FANTASY: fantasy.add(lightNovel); break;
//                case ACION: acion.add(lightNovel); break;
//                case DRAMA: drama.add(lightNovel); break;
//                case ROMANCE: romance.add(lightNovel); break;
//            }
//        }
//        categoriaListMap.put(Categoria.FANTASY,fantasy);
//        categoriaListMap.put(Categoria.ACION,acion);
//        categoriaListMap.put(Categoria.DRAMA,drama);
//        categoriaListMap.put(Categoria.ROMANCE,romance);
//
//        for (Map.Entry<Categoria, List<LightNovel>> entry : categoriaListMap.entrySet()){
//            System.out.println(entry);
//        }


        Map<Categoria, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria)); // Forma mais recomendada.
        System.out.println(collect);


    }
}
