package Parte07ClassesUtilitarias.Hnio.teste;


import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {


        Path p1 = Paths.get("/home/usuario/Java/Pasta2/Arquivo_Renomeado.txt");
        System.out.println(p1.getFileName());
    }
}
