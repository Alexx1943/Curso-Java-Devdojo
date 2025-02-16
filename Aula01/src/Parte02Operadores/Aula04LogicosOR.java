package Parte02Operadores;

public class Aula04LogicosOR {

    public static void main(String[] args){

        double ContaCorrente = 200;
        double ContaPoupanca = 30000;
        float PS5 = 5000f;
        boolean isPS5Compravel = ContaCorrente > PS5 || ContaPoupanca > PS5;

        System.out.println(ContaCorrente);
        System.out.println(ContaPoupanca);
        System.out.println(PS5);
        System.out.println(isPS5Compravel);




    }
}
