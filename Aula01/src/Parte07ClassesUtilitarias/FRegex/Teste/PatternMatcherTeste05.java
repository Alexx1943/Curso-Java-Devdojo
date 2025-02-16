package Parte07ClassesUtilitarias.FRegex.Teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
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
        // . 1.3 = Qualquercoisa que estiver entre o 1 e 3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "alextavares1943@gmail.com, #$*@gmail.com, luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gail.br, teste@gmail.com.br, sakura@mail.com ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Padrão: " + regex);
        System.out.println("Posições encontradas:");


        while (matcher.find()) {
            System.out.print(matcher.start() + ": " + matcher.group() + "\n ");
        }
    }
}
