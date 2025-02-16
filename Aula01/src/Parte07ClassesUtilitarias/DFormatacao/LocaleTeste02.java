package Parte07ClassesUtilitarias.DFormatacao;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // configuração do sistema(Idioma).

        String[] isoCoutries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCoutrie : isoCoutries){
            System.out.print(isoCoutrie + " ");

        }

        System.out.println();

        for (String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }

    }
}
