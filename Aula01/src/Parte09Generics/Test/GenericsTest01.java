package Parte09Generics.Test;

import Parte08Coleções.Dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Alex");
        lista.add("Alex Tavares");

        for (String list : lista) {
            System.out.println(list);
        }
        add(lista, new Consumidor("Alex"));

        for (Object list : lista) {
            System.out.println(list);
        }
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
