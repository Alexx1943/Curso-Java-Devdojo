package Parte06OrientacaoObjetos.AIntroducaoClasses.Teste;

import Parte06OrientacaoObjetos.AIntroducaoClasses.Dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Alex";
        estudante.idade = 28;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade+ " anos.");
        System.out.println(estudante.sexo);
    }
}
