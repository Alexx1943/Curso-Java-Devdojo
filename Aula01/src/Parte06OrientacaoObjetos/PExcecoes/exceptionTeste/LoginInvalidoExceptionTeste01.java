package Parte06OrientacaoObjetos.PExcecoes.exceptionTeste;

import Parte06OrientacaoObjetos.PExcecoes.Dominio.LoginInvalidaException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidaException e ){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidaException{
        Scanner scan = new Scanner(System.in);
        String nomeBD = "Alex";
        String senhaBD = "Senha";
        System.out.print("Digite o nome do usuario: ");
        String nome = scan.nextLine();
        System.out.print("Digite a senha do usuario: ");
        String senha = scan.nextLine();
        if (!nomeBD.equals(nome) || !senhaBD.equals(senha)){
            throw new LoginInvalidaException("usuario ou senha invalido");
        }
        System.out.println("Login com sucesso...");

    }
}
