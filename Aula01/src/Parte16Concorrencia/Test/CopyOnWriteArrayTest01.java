package Parte16Concorrencia.Test;

import Parte06OrientacaoObjetos.GAssocição.dominio.Time;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayTest01 {
    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(i);
        }

        Runnable runnableInterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 50; i++) {
                Integer remove = list.remove(i);
                System.out.printf("%s Removed %d%n", Thread.currentThread().getName(), remove);
            }
        };

        Thread t1 = new Thread(runnableInterator);
        Thread t2 = new Thread(runnableRemover);

        t1.start();
        t2.start();


    }
}
