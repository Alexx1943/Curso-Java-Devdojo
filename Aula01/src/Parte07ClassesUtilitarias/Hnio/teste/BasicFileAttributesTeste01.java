package Parte07ClassesUtilitarias.Hnio.teste;

import java.io.File;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BasicFileAttributesTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minusDays(10);
        File file = new File("pasta2/novo.txt");


    }
}