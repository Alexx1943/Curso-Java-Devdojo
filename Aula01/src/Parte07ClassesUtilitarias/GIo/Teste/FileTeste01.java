package Parte07ClassesUtilitarias.GIo.Teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolute : " + file.getAbsolutePath());
            System.out.println("Is diretory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Esse arquiv é oculto? " + file.isHidden());
            System.out.println("Last medified: " + new Date(file.lastModified()));
            System.out.println("Last modefied: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println(file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

