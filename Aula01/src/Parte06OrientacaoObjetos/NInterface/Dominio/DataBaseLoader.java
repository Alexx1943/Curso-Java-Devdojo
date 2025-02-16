package Parte06OrientacaoObjetos.NInterface.Dominio;

public class DataBaseLoader implements DataLoader, DataRemover {


    @Override
    public void load(){
        System.out.println("----------Banco de Dados----------");
        System.out.println("Carregando dados do banco de dados.");
    }
    @Override
    public void remove(){
        System.out.println("Removendo do banco de dados.");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checagem de permissão no banco de dados.");
    }

    public void retriveMaxDataSize(){
        System.out.println("Dentro retriveMaxDataSize do banco de dados.");
    }


}
