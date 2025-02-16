package Parte04EstruturasRepeticao;

public class Aula01LacosRepeticaoWhileDoWhileFor {
    public static void main(String[] args) {

        int cont = 0;

        while(cont < 10){
            
            System.out.println(++cont);
           }
        cont = 0;
        do {
            System.out.println("Dentro de do-while");
        }
        while(cont > 10);

        for (int i= 0; i < 10; i++){

        System.out.println("for "+ i);
        }

    }
}
