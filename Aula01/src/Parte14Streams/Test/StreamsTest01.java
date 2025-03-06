package Parte14Streams.Test;

import Parte14Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("V de Vingança", 5.99),
            new LightNovel("Cruzada", 3.75),
            new LightNovel("O Defensor", 1.99),
            new LightNovel("A outra historia americana", 4.00),
            new LightNovel("Carga explosiva", 10.90),
            new LightNovel("O poderoso chefão", 0.90),
            new LightNovel("Carga explosiva2", 3.00)
    ));

    public static void main(String[] args) {

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle)); // Ordenando a lista por title.
        List<String> titles = new ArrayList<>(); // Criando uma lista para receber os objetos seleciados.

        for (LightNovel lightNovel: lightNovels){ // Criando uma variavel local que faz referencia aos objetos da lista.
            if (lightNovel.getPrice() <=4){ // regra de negocio. caso verdadeiro.
                titles.add(lightNovel.getTitle()); // adicionar o objeto que passou na resgra de negocio a lista.
            }
            if (titles.size() >= 3){ // Ao atiginr o tamamha expecificado. Parar
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);


    }
}
