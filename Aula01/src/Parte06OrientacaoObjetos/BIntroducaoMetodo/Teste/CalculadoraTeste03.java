package Parte06OrientacaoObjetos.BIntroducaoMetodo.Teste;

import Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.subtraiDoisNumeros();
        calculadora.DivideDoisNumeros(20,2);
        double Resultado = calculadora.DivideDoisNumeros(20,0);
        System.out.println(Resultado);
    }
}
