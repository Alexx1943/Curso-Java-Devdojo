package Parte15Threads.test;

class ThreadExemplo extends Thread {
    private final char c;

    public ThreadExemplo(char c) {
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
        }
    }
}

class ThreadExemploRunnable implements Runnable {
    private final char c;

    public ThreadExemploRunnable(char c) {
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
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }

    }
}


public class ThreadTest01 {
    public static void main(String[] args) {

//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

        Thread t1 = new Thread(new ThreadExemploRunnable('A'));
        Thread t2 = new Thread(new ThreadExemploRunnable('B'));
        Thread t3 = new Thread(new ThreadExemploRunnable('C'));
        Thread t4 = new Thread(new ThreadExemploRunnable('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
