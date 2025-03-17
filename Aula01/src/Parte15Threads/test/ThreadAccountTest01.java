package Parte15Threads.test;

import Parte15Threads.Dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {

        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01,"Pessoa1");
        Thread t2 = new Thread(threadAccountTest01,"Pessoa2");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("Saldo insuficiente");
            }
        }

    }

    public void withdrawal(int amount) {
        System.out.println("Fora do synchronized " + Thread.currentThread().getName());
        synchronized(account) {
            System.out.println("Dentro do synchronized " + Thread.currentThread().getName());
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " Está indo sacar dinheiro ");
                account.withdrawal(amount);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " Comppletou o saque: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " Efetuar saque " + account.getBalance());
            }
        }
    }


}
