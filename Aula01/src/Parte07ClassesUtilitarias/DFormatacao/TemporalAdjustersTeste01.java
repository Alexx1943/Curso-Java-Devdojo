package Parte07ClassesUtilitarias.DFormatacao;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        now = now.withMonth(2);
        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("-----Primeiro dia do ano-----");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("-----Primeiro dia do mês-----");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()) ;
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("-----Primeiro dia do proximo ano-----");


        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());







    }
}
