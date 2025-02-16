package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.AlteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTeste04");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);

    }
}
