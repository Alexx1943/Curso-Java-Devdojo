package Parte06OrientacaoObjetos.AIntroducaoClasses.Teste;

import Parte06OrientacaoObjetos.AIntroducaoClasses.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {


        Professor professor = new Professor();

        professor.nome = "Alex Professor";
        professor.idade = 56;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome+"Idade: "+professor.idade+"Sexo: "+professor.sexo);





    }
}
