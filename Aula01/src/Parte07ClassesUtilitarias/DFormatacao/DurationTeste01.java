package Parte07ClassesUtilitarias.DFormatacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime tineNow = LocalTime.now().minusHours(7);
        LocalTime timeMinus7Hours = LocalTime.now().plusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(tineNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(300);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(tineNow);
        System.out.println(now);
        System.out.println(d4);


    }
}
