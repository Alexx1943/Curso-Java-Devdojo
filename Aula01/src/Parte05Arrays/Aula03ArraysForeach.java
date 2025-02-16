package Parte05Arrays;

public class Aula03ArraysForeach {
    public static void main(String[] args) {

        int[] Primeira = new int[1];
        int[] Segunda = {1,2};
        int[] Terceira = new int[]{1,2,3};

        for (int i = 0; i < Primeira.length; i++) {

            System.out.println(Primeira[i]);

        }
        for (int num: Terceira){
            System.out.println(num);
        }


    }
}
