package Parte08Coleções.Teste;

import Parte08Coleções.Dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("123a", "Iphone");
        Smartphone smatphone2 = new Smartphone("123a", "Iphone");

        System.out.println(smartphone1.equals(smatphone2));
    }
}
