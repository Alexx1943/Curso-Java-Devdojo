package Parte06OrientacaoObjetos.GAssocição.Teste;

import Parte06OrientacaoObjetos.GAssocição.dominio.Jogador;
import Parte06OrientacaoObjetos.GAssocição.dominio.Time;

public class jogadorTeste03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");




        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);




        System.out.println("------Jogador-------");
        jogador.imprime();

        System.out.println("--------Time--------");
        time.imprime();
    }
}
