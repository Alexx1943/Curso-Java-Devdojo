package Parte06OrientacaoObjetos.NInterface.Dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load(){
        System.out.println("----------Arquivos----------");
        System.out.println("Carregando dados de um arquivo.");
    }
    @Override
    public void remove(){
        System.out.println("Removendo dados de um arquivo.");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checagem de permissão no arquivo.");
    }
}
