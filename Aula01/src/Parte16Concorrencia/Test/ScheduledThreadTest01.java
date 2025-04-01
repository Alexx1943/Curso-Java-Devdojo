package Parte16Concorrencia.Test;

import Parte06OrientacaoObjetos.HSeminario.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadTest01 {

    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void bepper(){

         Runnable run = () ->{
             System.out.println(LocalTime.now().format(formatter) + " Bepper");
         };
         executor.schedule(run,2, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {

        System.out.println(LocalTime.now().format(formatter));
        bepper();
    }


}
