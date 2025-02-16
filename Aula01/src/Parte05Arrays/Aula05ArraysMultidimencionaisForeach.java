package Parte05Arrays;

public class Aula05ArraysMultidimencionaisForeach {
    public static void main(String[] args) {

        int[][] dias = new int[3][];

        dias[0] = new int[1];
        dias[1] = new int[17];
        dias[2] = new int[30];

        for (int[] Dias: dias){
            System.out.println("\n----------");
            for (int num: Dias){
                System.out.print(num+" ");

            }

        }

    }
}
