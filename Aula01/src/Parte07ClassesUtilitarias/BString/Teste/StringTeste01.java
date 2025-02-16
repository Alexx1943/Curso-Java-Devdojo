package Parte07ClassesUtilitarias.BString.Teste;

public class StringTeste01 {
    public static void main(String[] args) {
        
        String nome = "Alex"; // String pool( é imutavel).
        String nome2 = "Alex";
        nome = nome.concat(" Tavares");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Alex");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
