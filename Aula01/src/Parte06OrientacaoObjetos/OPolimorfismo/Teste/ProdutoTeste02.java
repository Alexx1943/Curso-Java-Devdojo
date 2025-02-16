package Parte06OrientacaoObjetos.OPolimorfismo.Teste;

import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Computador;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Produto;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Televisao;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Tomate;
import Parte06OrientacaoObjetos.OPolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Dell", 10000);
        Produto produto2 = new Tomate("Tomate", 100);
        Produto produto3 = new Televisao("Samsung", 10000);



        CalculadoraImposto.calcularImposto(produto);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto3);
    }
}
