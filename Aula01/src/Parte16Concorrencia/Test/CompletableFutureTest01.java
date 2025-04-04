package Parte16Concorrencia.Test;

import Parte16Concorrencia.Service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {

        StoreService storeService = new StoreService();
        searchPricesSync(storeService);
        System.out.println("-------------------------------------------");
        searchPricesAsSyncSFuture(storeService);
        System.out.println("-------------------------------------------");
        searchPricesAsSyncCompletableFuturee(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }

    private static void searchPricesAsSyncSFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsSyncSFuture1 = storeService.getPricesAsSyncFuture("Store 1");
        Future<Double> pricesAsSyncSFuture2 = storeService.getPricesAsSyncFuture("Store 2");
        Future<Double> pricesAsSyncSFuture3 = storeService.getPricesAsSyncFuture("Store 3");
        Future<Double> pricesAsSyncSFuture4 = storeService.getPricesAsSyncFuture("Store 4");
        try {
            System.out.println(pricesAsSyncSFuture1.get());
            System.out.println(pricesAsSyncSFuture2.get());
            System.out.println(pricesAsSyncSFuture3.get());
            System.out.println(pricesAsSyncSFuture4.get());
        } catch (InterruptedException | ExecutionException e) {

            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
        storeService.shutdown();
    }

    private static void searchPricesAsSyncCompletableFuturee(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsSyncSFuture1 = storeService.getPricesAsSyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsSyncSFuture2 = storeService.getPricesAsSyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsSyncSFuture3 = storeService.getPricesAsSyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsSyncSFuture4 = storeService.getPricesAsSyncCompletableFuture("Store 4");

            System.out.println(pricesAsSyncSFuture1.join());
            System.out.println(pricesAsSyncSFuture2.join());
            System.out.println(pricesAsSyncSFuture3.join());
            System.out.println(pricesAsSyncSFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));

    }
}
