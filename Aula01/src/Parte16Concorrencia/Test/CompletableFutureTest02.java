package Parte16Concorrencia.Test;

import Parte16Concorrencia.Service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {

        StoreService storeService = new StoreService();
        searchPricesAsSyncCompletableFuturee(storeService);

    }

    private static void searchPricesAsSyncCompletableFuturee(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> store = List.of("Store1", "Store2", "Strore3", "Store4");

        List<CompletableFuture<Double>> completableFutures = store.stream()
                .map(storeService::getPricesAsSyncCompletableFuture)
                .collect(Collectors.toList());

        Stream<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join);

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));

    }
}
