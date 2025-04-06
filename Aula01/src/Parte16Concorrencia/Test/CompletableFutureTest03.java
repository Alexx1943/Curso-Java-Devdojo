package Parte16Concorrencia.Test;

import Parte16Concorrencia.Service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {

        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsSyncCompletableFuturee(storeServiceDeprecated);

    }

    private static void searchPricesAsSyncCompletableFuturee(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> store = List.of("Store1", "Store2", "Strore3", "Store4");

        List<CompletableFuture<Double>> completableFutures = store.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));

    }
}
