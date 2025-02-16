package Parte06OrientacaoObjetos.GAssocição.Teste;

import Parte06OrientacaoObjetos.GAssocição.dominio.Escola;
import Parte06OrientacaoObjetos.GAssocição.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Franklin");
        Professor[] professores = {professor};
        Escola escola = new Escola("UniFECAF", professores);



        escola.imprime();
    }
}
