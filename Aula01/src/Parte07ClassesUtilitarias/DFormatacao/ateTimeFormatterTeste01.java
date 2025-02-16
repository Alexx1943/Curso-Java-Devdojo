package Parte07ClassesUtilitarias.DFormatacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ateTimeFormatterTeste01 {
    public static void main(String[] args) {
        // format = Está transformando de um objeto para uma String.
        // parse = Está transformando de uma String para um objeto.

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
