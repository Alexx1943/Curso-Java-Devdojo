package Parte06OrientacaoObjetos.PExcecoes.exceptionTeste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado" + iscriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
