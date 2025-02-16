package Parte07ClassesUtilitarias.DFormatacao;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(23, 59, 10);
        LocalTime time2 = LocalTime.now();

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.get(ChronoField.CLOCK_HOUR_OF_DAY));












    }
}
