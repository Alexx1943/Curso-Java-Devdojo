package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTeste01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("123", "Iphone1");
        Smartphone s2 = new Smartphone("1234", "Iphone2");
        Smartphone s3 = new Smartphone("1234", "Iphone3");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
//        smartphones.clear(); deleta tudo que esta dentro da lista.

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

    }
}
