package Parte17DesignPatterns.Test;

import Parte17DesignPatterns.Dominio.Country;
import Parte17DesignPatterns.Dominio.Currency;
import Parte17DesignPatterns.Dominio.CurrencyFactory;
import Parte17DesignPatterns.Dominio.Person;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {

        Currency brasil = CurrencyFactory.newCurrency(Country.BRASIL);
        Currency usa = CurrencyFactory.newCurrency(Country.USA);

        System.out.println(brasil.getSymbol());
        System.out.println(usa.getSymbol());




    }
}
