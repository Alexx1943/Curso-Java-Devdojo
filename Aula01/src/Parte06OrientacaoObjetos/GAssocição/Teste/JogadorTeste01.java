package Parte06OrientacaoObjetos.GAssocição.Teste;

import Parte06OrientacaoObjetos.GAssocição.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Zico");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador: jogadores){
           jogador.imprime();
        }






    }
}
