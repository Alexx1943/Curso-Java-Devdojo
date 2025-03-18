package Parte15Threads.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou o email na lista ");
            emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "Checando se existe email");
        synchronized (this.emails){
            while (emails.size() == 0){
                if (!open) return null;
                    System.out.println(Thread.currentThread().getName() + " Não existe email na lista, entrando em modo de espera");
                    this.emails.wait();



            }
            return this.emails.poll();
        }
    }

    public void close(){
        System.out.println(Thread.currentThread().getName() + "Não estamos recebendo mais emails ");
    }



}
