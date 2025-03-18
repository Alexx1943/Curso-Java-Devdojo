package Parte15Threads.test;

import Parte15Threads.Dominio.Members;
import Parte15Threads.Service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {

        Members members = new Members();
        Thread pessoa1 = new Thread(new EmailDeliveryService(members), "Pessoa1");
        Thread pessoa2 = new Thread(new EmailDeliveryService(members), "Pessoa2");

        pessoa1.start();
        pessoa2.start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com o seu email: ");
            if (email == null || email.isEmpty()){
                members.close();
            }
            members.addMemberEmail(email);
        }


    }
}
