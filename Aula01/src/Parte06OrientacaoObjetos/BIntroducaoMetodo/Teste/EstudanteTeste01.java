package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Estudante;
import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Alex";
        estudante01.idade = 28;
        estudante01.sexo = 'M';

        estudante02.nome = "Alex2";
        estudante02.idade = 29;
        estudante02.sexo = 'M';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);









    }
}
