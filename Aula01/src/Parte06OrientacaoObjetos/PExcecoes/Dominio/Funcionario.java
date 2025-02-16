package Parte06OrientacaoObjetos.PExcecoes.Dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar()throws LoginInvalidaException, ArithmeticException{
        System.out.println("Salvando funcionario.");
    }
}
