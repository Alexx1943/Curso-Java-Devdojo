package Parte10ClassesInternas.Test;

public class OuterClassesTest02 {
    private String name = "Alex";

    void print() {
        class LocalClass {
            final private String lastName = "Tavares";

            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
//        LocalClass localClass = new LocalClass(); outra forma possivel
//        localClass.printLocal();
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {

        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print();
    }
}
