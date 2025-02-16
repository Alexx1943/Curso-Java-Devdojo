package Parte07ClassesUtilitarias.BString.Teste;

public class StringbuilderBufferTeste01 {
    public static void main(String[] args) {

        String nome = "Alex";
        nome.concat("Tavares");
        nome = nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Alex Tavares ");
        sb.append("de").append(" Oliveira");
        sb.reverse();
        sb.reverse(); // inverte a ordem de trás pra frente.
        sb.delete(0,3);
        System.out.println(sb);

    }
}
