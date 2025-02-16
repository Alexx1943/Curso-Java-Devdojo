package Parte06OrientacaoObjetos.OPolimorfismo.Teste;

import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Computador;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Produto;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Tomate;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Produto produto =new Computador("Samsung", 10000);
        Tomate tomate = new Tomate("Tomate", 35);

        tomate.setDataValidade("15/11/2024");

    }
}
