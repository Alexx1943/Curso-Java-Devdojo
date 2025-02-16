package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros01 = {1,2,3,4,5};
        calculadora.SomaArrays(numeros01);
        calculadora.VarArgs(1,2,3,4,5,6,7,8,9,10);


    }
}
