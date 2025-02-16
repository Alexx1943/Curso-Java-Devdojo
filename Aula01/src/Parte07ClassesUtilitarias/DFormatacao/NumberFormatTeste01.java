package Parte07ClassesUtilitarias.DFormatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale LocaleBR = new Locale("pt", "BR");
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[3];

        nf[0] = NumberFormat.getInstance(LocaleBR);
        nf[1] = NumberFormat.getInstance(LocaleJP);
        nf[2] = NumberFormat.getInstance(LocaleIT);

        double valor = 10_000_000.758975789;

        for (NumberFormat numberFormat : nf){
            System.out.println(numberFormat.format(valor));
        }



    }
}
