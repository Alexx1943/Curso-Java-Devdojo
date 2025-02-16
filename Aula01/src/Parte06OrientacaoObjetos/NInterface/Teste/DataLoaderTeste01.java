package Parte06OrientacaoObjetos.NInterface.Teste;

import Parte06OrientacaoObjetos.NInterface.Dominio.DataBaseLoader;
import Parte06OrientacaoObjetos.NInterface.Dominio.DataLoader;
import Parte06OrientacaoObjetos.NInterface.Dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        dataBaseLoader.retriveMaxDataSize();



    }
}
