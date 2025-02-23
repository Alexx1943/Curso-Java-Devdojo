package Parte08Coleções.Teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nome = new ArrayList();
        List<String> nome2 = new ArrayList<>();

        nome.add("Alex");
        nome.add("Tavares");

        nome2.add("alex");
        nome2.add("tavares");

        nome.addAll(nome2);

//        System.out.println(nome.remove("Alex"));

        for (String nomes : nome) {
            System.out.println(nomes);
        }
        System.out.println("--------------------");
        nome.add("Allan");

        for (int i = 0; i < nome.size(); i++){
            System.out.println(nome.get(i));
        }




    }
}
