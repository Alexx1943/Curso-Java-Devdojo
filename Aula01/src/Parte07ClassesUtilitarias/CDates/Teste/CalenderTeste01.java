package Parte07ClassesUtilitarias.CDates.Teste;

import java.util.Calendar;
import java.util.Date;

public class CalenderTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana...");
        }
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        c.add(Calendar.DAY_OF_MONTH, 0);
        c.add(Calendar.HOUR, 12);
        Date date = c.getTime();
        System.out.println(date);


    }
}
