package Parte07ClassesUtilitarias.DFormatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale LocaleBR = new Locale("pt", "BR");
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[3];

        nf[0] = NumberFormat.getCurrencyInstance(LocaleBR);
        nf[1] = NumberFormat.getCurrencyInstance(LocaleJP);
        nf[2] = NumberFormat.getCurrencyInstance(LocaleIT);

        double valor = 10_000_000.758975789;

        for (NumberFormat numberFormat : nf){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000";

        try {
            nf[0].parse(valorString);
        }catch (ParseException e){
            e.printStackTrace();
        }



    }
}
