package Parte15Threads.test;

import java.util.ArrayList;
import java.util.List;


class ThredSafeNames{
    List<String> names = new ArrayList<>();

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if (names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }


}
public class ThreadSafeTest01 {
    public static void main(String[] args) {

        ThredSafeNames thredSafeNames = new ThredSafeNames();
        thredSafeNames.add("Alex");

        Runnable run = thredSafeNames::removeFirst;

        new Thread(run).start();
        new Thread(run).start();


        
    }
}
