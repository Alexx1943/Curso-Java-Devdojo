package Parte07ClassesUtilitarias.Hnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste01 {
    public static void main(String[] args) {

        String diretorioProjeto = "/home/usuario/Java/Home/Alex/Dev";
        String arquivTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./ALex/./Dev");
        System.out.println(path2);
        System.out.println(path2.normalize());


    }
}
