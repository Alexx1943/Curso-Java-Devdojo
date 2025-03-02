package Parte10ClassesInternas.Test;

import javax.print.attribute.standard.OrientationRequested;

public class OuterClassesTest03 {
    private String name = "Alex";

    static class Nested {
        private String lastName = "Tavares de Oliveira";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {

        OuterClassesTest03 outer = new OuterClassesTest03();
        Nested nested = new Nested();

        nested.print();


    }
}
