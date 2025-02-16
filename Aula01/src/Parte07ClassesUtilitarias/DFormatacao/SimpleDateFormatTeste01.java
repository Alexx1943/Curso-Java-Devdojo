package Parte07ClassesUtilitarias.DFormatacao;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        String pattern = "'Taboão da Serra 'dd 'de' MMMM 'de' yyyy  ";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("19 de janeiro de 2025"));
        }catch (ParseException e){
            e.printStackTrace();
        }









    }
}
