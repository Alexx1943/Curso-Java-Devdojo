package Parte17DesignPatterns.Test;

import Parte17DesignPatterns.Dominio.Person;

public class BuilderPatterTest01 {
    public static void main(String[] args) {

        Person build = new Person.PersonBuilder()
                .firstName("Alex")
                .lastName("Tavares de Oliveira")
                .userNAme("alexx19")
                .email("alextavares1943@gmail.com")
                .build();

        System.out.println(build);
    }
}
