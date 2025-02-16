package Parte06OrientacaoObjetos.MClassesAbstratatas.Teste;

import Parte06OrientacaoObjetos.MClassesAbstratatas.dominio.Desenvolvedor;
import Parte06OrientacaoObjetos.MClassesAbstratatas.dominio.Funcionario;
import Parte06OrientacaoObjetos.MClassesAbstratatas.dominio.Gerente;

public class FuncionaTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Alex", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alex", 7000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
