package Parte06OrientacaoObjetos.AIntroducaoClasses.Teste;

import Parte06OrientacaoObjetos.AIntroducaoClasses.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno";
        carro1.modelo = "Prime";
        carro1.ano = 2003;

        carro2.nome = "Gol";
        carro2.modelo = "sport";
        carro2.ano = 2000;

        System.out.println("Carro1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("--------------------------------");

        System.out.println("Carro2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
