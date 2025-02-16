package Parte06OrientacaoObjetos.NInterface.Dominio;

public interface DataLoader {

    void load();
    default void checkPermission(){
        int MAX_DATA_SIZE = 10;
        System.out.println("Checagem de permissôes.");
    }
    static void retriveMaxDataSize(){
        System.out.println("Dentro retriveMaxDataSize da interface.");
    }
}
