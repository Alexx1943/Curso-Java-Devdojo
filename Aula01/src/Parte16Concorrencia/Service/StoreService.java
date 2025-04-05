package Parte16Concorrencia.Service;


import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService executor = Executors.newCachedThreadPool(); // Podendo criar threads de acordo com a necessecidade.

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync fo store %s%n",storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsSyncFuture(String storeName){
        System.out.printf("Getting prices sync fo store %s%n",storeName);
        return executor.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsSyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync fo store %s%n",storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public void shutdown(){
        executor.shutdown();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price: %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1,500)*37;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
