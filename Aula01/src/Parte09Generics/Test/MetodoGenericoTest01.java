package Parte09Generics.Test;

import Parte08Coleções.Dominio.Consumidor;
import Parte09Generics.Dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Consumidor> consumidors = criarArrayComUmObjeto(new Consumidor("Alex"));
        System.out.println(consumidors);

    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
