package Parte16Concorrencia.Test;


import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private final String name;
    private final ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if (lock.isHeldByCurrentThread()) ;
            { // Veifica se o lock está com a thread que tá executando.
                System.out.printf("Thread %s entrou em uma seção critica %n", name); // %s = String..
            }
            System.out.printf("%d Thread esperando na fila %n", lock.getQueueLength()); // %d = inteiro. %f = float. %n = pular linha.
            System.out.printf("Thread %s Vai esperar 2s %n", name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new Worker("Thread-1", lock)).start();
        new Thread(new Worker("Thread-2", lock)).start();
        new Thread(new Worker("Thread-3", lock)).start();
        new Thread(new Worker("Thread-4", lock)).start();
        new Thread(new Worker("Thread-5", lock)).start();
        new Thread(new Worker("Thread-6", lock)).start();
        new Thread(new Worker("Thread-7", lock)).start();


    }
}
