package Parte09Generics.Service;

import Parte09Generics.Dominio.Carro;

import java.util.List;

public class RentalService<T>{
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T  buscarObjetosDisponiveis() {
        System.out.println("Buscando carros disponiveis: ");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro" + t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvento objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }


}
