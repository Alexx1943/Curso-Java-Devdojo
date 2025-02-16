package Parte07ClassesUtilitarias.BString.Teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "       Alex       ";
        String num = "012345";
        System.out.println(nome.charAt(3)); // retorna o char deseado no indece nesse caso, retorna o X.
        System.out.println(nome.length()); // retorna o tamanho da variavel, nesse caso, 4.
        System.out.println(nome.replace('A','@'));// Troca o caractere da primeira posição(posição zero) por outro caractere da sua escolha.
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.substring(0,4));
        System.out.println(nome.trim()); // remove os valores em branco no começo e final.
    }
}
