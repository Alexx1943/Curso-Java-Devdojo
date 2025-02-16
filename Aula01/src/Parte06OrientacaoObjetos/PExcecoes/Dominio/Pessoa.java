package Parte06OrientacaoObjetos.PExcecoes.Dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidaException, FileNotFoundException{
        System.out.println("Salvando pessoa.");
    }
}
