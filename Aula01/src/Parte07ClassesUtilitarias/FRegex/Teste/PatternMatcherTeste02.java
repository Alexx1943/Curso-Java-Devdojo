package Parte07ClassesUtilitarias.FRegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        //  \d = Todos os digitos
        // \D = Todos os que não são digitos.
        // \s = Todos os espaços em branco. \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos.
        // \w = az AZ, digitos, _
        // \W = Todo que não está incluso no \w

        String regex = "\\D";
        String texto = "1kflneo2vn1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("Padrão: " + regex);
        System.out.println("Posições encontradas:");


        while (matcher.find()) {
            System.out.print(matcher.start() + ": " + matcher.group() + "\n ");
        }

    }
}
