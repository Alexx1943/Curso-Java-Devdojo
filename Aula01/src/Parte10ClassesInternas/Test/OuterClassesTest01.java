package Parte10ClassesInternas.Test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy ";


    class Inner{
        public void pritnOuterclassesAttribute(){
            System.out.println(name);
            System.out.println(this); // Chama dentro do Inner
            System.out.println(OuterClassesTest01.this); // Chama a OuterClassesTest01
        }

    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
//        Inner inner = outerClasses.new Inner(); Possivel de ser usado, mas não muito comum.
//        Inner inner = new OuterClassesTest01().new Inner(); Outra possivel forma.
        Inner inner = outerClasses.new Inner();
        inner.pritnOuterclassesAttribute();


    }
}
