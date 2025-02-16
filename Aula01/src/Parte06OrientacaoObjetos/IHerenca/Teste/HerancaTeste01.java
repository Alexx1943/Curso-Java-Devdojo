package Parte06OrientacaoObjetos.IHerenca.Teste;

import Parte06OrientacaoObjetos.IHerenca.dominio.Endereco;
import Parte06OrientacaoObjetos.IHerenca.dominio.Funcionario;
import Parte06OrientacaoObjetos.IHerenca.dominio.Pessoa;

import java.util.Scanner;
public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Caneleira");
        endereco.setCEP("06774-030");

        System.out.println("-----Pessoa-----");
        Pessoa pessoa = new Pessoa("Alex Tavares");
        pessoa.setCPF("443.087.828/56");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----Funcionario-----");
        Funcionario funcionario = new Funcionario("Alex");
        funcionario.setCPF("443.087.828/56");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3500);
        funcionario.imprime();












    }
}
