package Parte17DesignPatterns.Dominio;

public class CurrencyFactory {

    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new USDollar();
            case BRASIL:
                return new Real();
            default:
                throw new IllegalArgumentException("not currency found  for this  country");
        }
    }
}
