package Parte06OrientacaoObjetos.AIntroducaoClasses.Teste;

import Parte06OrientacaoObjetos.AIntroducaoClasses.Dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Alex";
        estudante2.nome = "Alex2";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("_--------------------------_");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);






    }
}
