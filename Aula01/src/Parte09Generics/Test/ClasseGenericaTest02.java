package Parte09Generics.Test;

import Parte09Generics.Dominio.Barco;
import Parte09Generics.Dominio.Carro;
import Parte09Generics.Service.BarcoRentavelService;
import Parte09Generics.Service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.bucarBarcoDisponivel();

        System.out.println("Usando o barco por um mês");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
