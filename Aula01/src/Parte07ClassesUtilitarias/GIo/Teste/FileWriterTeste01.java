package Parte07ClassesUtilitarias.GIo.Teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    //File
    //FileWriter
    //FileReader
    //BufferedWriter
    //BufferedReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Java e Spring Boot");
            fw.flush(); // Liberar.

        }catch (IOException e){
            e.printStackTrace();
        }






    }
}
