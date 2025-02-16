package Parte06OrientacaoObjetos.PExcecoes.exceptionTeste;

import Parte06OrientacaoObjetos.PExcecoes.Dominio.Funcionario;
import Parte06OrientacaoObjetos.PExcecoes.Dominio.LoginInvalidaException;
import Parte06OrientacaoObjetos.PExcecoes.Dominio.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;

public class SobrescritaCOmExceptionTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }catch (LoginInvalidaException | ArithmeticException e){
            e.printStackTrace();
        }

        try {
            pessoa.salvar();
        }catch (LoginInvalidaException | FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
