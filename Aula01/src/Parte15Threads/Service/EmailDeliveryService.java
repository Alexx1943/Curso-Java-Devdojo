package Parte15Threads.Service;

import Parte15Threads.Dominio.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Staring to deliver emails ");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retriveEmail();
                if (email == null) continue;
                System.out.println(threadName + " Enviando email para: " + email);
                Thread.sleep(1000);
                System.out.println(threadName + " Enviou email com sucesso para: " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" Todos os emails foram enviado com sucesso ");
    }
}
