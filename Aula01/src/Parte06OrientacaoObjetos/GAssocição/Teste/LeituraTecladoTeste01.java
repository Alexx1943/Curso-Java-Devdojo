package Parte06OrientacaoObjetos.GAssocição.Teste;

import java.util.Scanner;

public class LeituraTecladoTeste01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("------------------");

        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
