package Parte07ClassesUtilitarias.DFormatacao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {

        LocalDate tempoDeVida = LocalDate.of(1994,8,7);
        LocalDate now = LocalDate.now();

        System.out.println("Dias: " + ChronoUnit.DAYS.between(tempoDeVida, now));
        System.out.println("Semanas:  " + ChronoUnit.WEEKS.between(tempoDeVida, now));
        System.out.println("Meses:  " + ChronoUnit.MONTHS.between(tempoDeVida, now));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(tempoDeVida, now));

    }
}
