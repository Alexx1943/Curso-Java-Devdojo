package Parte02Operadores;

public class Aula03LogicosAND {

    public static void main(String[] args){

        int idade = 29;
        float salario = 3500f;

        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQue30: "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentrodaLeiMenorQue30: "+isDentrodaLeiMenorQue30);





    }
}
