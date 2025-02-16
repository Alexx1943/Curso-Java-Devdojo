package Parte06OrientacaoObjetos.CSobrecargaMetodos.Teste;

import Parte06OrientacaoObjetos.CSobrecargaMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Bobão","TV",12,"Ação", "teste");
        anime.imprime();
    }
}
