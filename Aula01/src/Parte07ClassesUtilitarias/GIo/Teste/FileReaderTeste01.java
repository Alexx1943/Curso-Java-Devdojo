package Parte07ClassesUtilitarias.GIo.Teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        //  char[] in = new char[23];
        //  fr.read(in);
        //  for (char c : in) {
        //      System.out.print(c);
        //}
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read())!=-1){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
