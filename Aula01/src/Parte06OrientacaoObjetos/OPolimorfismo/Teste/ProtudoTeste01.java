package Parte06OrientacaoObjetos.OPolimorfismo.Teste;

import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Computador;
import Parte06OrientacaoObjetos.OPolimorfismo.Dominio.Tomate;
import Parte06OrientacaoObjetos.OPolimorfismo.Servico.CalculadoraImposto;

public class ProtudoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Dell",10000);
        Tomate tomate = new Tomate("Tomate", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
