package Parte06OrientacaoObjetos.BIntroducaoMetodo.Dominio;

public class Calculadora {
    public void somaDoiNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(1000 - 100);
    }

    public  void multipliqueDoisBNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double DivideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void AlteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);

    }

    public void SomaArrays(int[] numeros01){
        int soma = 0;
        for (int num01: numeros01){
            soma += num01;
        }
        System.out.println(soma);

    }

    public void VarArgs(int... numeros02){
        int soma = 0;
        for (int num02: numeros02){
            soma += num02;

        }
        System.out.println(soma);

    }

}
