package Parte09Generics.Test;

import Parte09Generics.Dominio.Carro;
import Parte09Generics.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.bucarCarroDisponivel();

        System.out.println("Usando o carro por um mês");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
