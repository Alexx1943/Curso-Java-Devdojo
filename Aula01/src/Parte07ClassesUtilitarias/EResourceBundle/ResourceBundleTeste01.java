package Parte07ClassesUtilitarias.EResourceBundle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("mensagens", new Locale("en","US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));



    }
}
