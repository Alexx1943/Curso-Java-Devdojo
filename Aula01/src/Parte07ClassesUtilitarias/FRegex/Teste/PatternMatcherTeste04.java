package Parte07ClassesUtilitarias.FRegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        //  \d = Todos os digitos
        // \D = Todos os que não são digitos.
        // \s = Todos os espaços em branco. \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos.
        // \w = az AZ, digitos, _
        // \W = Todo que não está incluso no \w
        // []
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n até m
        // ()
        // |
        // $
        // .

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0XFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("Padrão: " + regex);
        System.out.println("Posições encontradas:");


        while (matcher.find()) {
            System.out.print(matcher.start() + ": " + matcher.group() + "\n ");
        }
        int numerohexa = 0x109ff;
        System.out.println(numerohexa);

    }
}
