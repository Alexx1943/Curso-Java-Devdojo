package Parte16Concorrencia;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);

        bq.put("Alex");
        System.out.printf("%s Added the value $s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add onether value ");
        bq.put("Tavares");
        System.out.printf("%s Added the value $s%n", Thread.currentThread().getName(), bq.peek());

    }

    static class removeFromQueue implements Runnable {

        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);

        public removeFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s Going to sleep for 2s  $s%n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s Removing value from queue $s%n", Thread.currentThread().getName(), bq.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
