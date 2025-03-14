package Parte14Streams.Test;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumfor(num);


    }

    private static void sumfor(long num) {
        System.out.println("sun for");
        long result = 0;
        long unit = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " +(end-unit)+"ms");
    }

}
