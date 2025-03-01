package Parte09Generics.Test;


public class WildcardTest02 {
    public static void main(String[] args) {


    }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
