package Parte16Concorrencia.Test;

import Parte16Concorrencia.Service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {

        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store1", "Store2", "Strore3", "Store4");
        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
    }

}
