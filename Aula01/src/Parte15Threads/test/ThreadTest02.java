package Parte15Threads.test;



class ThreadExemploRunnable2 implements Runnable {
    private final String c;

    public ThreadExemploRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}


public class ThreadTest02 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadExemploRunnable2("Alex"));
        Thread t2 = new Thread(new ThreadExemploRunnable2("Tavares de Oliveira"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t1.join(); // só executa outras threads quando a t1 for terminada.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();




    }
}
