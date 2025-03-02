package Parte09Generics.Test;

import Parte08Coleções.Dominio.Manga;
import Parte09Generics.Dominio.Barco;
import Parte09Generics.Dominio.Carro;
import Parte09Generics.Service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Uno")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetosDisponiveis();
        System.out.println("Usando carro por um mẽs");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetosDisponiveis();
        System.out.println("Usando barco por um mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
