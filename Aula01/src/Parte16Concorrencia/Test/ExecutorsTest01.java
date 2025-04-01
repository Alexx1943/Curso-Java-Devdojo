package Parte16Concorrencia.Test;

import Parte06OrientacaoObjetos.GAssocição.dominio.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s Iniciou:%d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s Finalizou:%d%n", Thread.currentThread().getName(),num);
    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {

//      ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); // Utilizando todas as threads do meu processador.
//      ExecutorService executorService = Executors.newSingleThreadExecutor(); // Utilizando apenas uma thread.
        ExecutorService executorService = Executors.newCachedThreadPool(); // Cria thread de acordo com a necessidade
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService.execute(new Printer(7));
        executorService.execute(new Printer(8));
        executorService.execute(new Printer(9));
        executorService.execute(new Printer(10));
        executorService.shutdown();

    }
}
