package Parte06OrientacaoObjetos.GAssocição.Teste;

import java.util.Scanner;

public class LeituraTecladoTeste02 {
    public static void main(String[] args) {

       Scanner input =  new Scanner(System.in);

       System.out.print("Digite seu peso: ");
       double peso = input.nextFloat();
        System.out.println("Peso:" + peso);

        System.out.print("Digite sua altura: ");
        double altura = input.nextFloat();
        System.out.println("Altura: " + altura);

        double IMC = peso * altura;
        System.out.println("IMC: " + IMC);



    }
}
