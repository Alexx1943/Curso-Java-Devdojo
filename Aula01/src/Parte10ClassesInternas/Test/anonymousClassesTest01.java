package Parte10ClassesInternas.Test;


class Animal{
    public void walk(){
        System.out.println("Aniaml walking");
    }
}
public class anonymousClassesTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
