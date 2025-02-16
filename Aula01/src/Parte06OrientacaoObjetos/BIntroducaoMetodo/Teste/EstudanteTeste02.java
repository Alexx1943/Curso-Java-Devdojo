package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Alex";
        estudante01.idade = 28;
        estudante01.sexo = 'M';

        estudante02.nome = "Alex2";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
