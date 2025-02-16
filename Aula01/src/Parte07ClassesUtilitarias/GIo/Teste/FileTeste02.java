package Parte07ClassesUtilitarias.GIo.Teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("Pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDiretorio,"Arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretorio,"Arquivo_Renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File renamedDiretory = new File("Pasta2");
        boolean isDiretoryRenamed = fileDiretorio.renameTo(renamedDiretory);
        System.out.println(isDiretoryRenamed);


    }
}
