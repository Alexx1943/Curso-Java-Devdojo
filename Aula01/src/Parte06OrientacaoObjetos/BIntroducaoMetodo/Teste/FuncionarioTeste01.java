package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Alex";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{2000, 1500.25,300.72};
        funcionario.imprime();
        funcionario.imprimeMediaSalario();


    }
}
