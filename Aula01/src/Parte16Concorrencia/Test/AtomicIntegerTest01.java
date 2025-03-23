package Parte16Concorrencia.Test;


import java.util.concurrent.atomic.AtomicInteger;

class Couter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    void increment() {
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {


        Couter couter = new Couter();
        Runnable run = () -> {
            for (int i = 0; i < 10000; i++) {
                couter.increment();
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t1.start();
        t2.start();

        t1.join();
        t1.join();

        System.out.println(couter.getCount());
        System.out.println(couter.getAtomicInteger());




    }
}
