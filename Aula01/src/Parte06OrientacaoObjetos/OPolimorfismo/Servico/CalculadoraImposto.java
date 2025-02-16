package Parte06OrientacaoObjetos.OPolimorfismo.Servico;

import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Computador;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Produto;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de impostos");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }
}
