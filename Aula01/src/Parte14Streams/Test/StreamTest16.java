package Parte14Streams.Test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {


        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 50_000_000;

        sumfor(num);
        sumStreamInterate(num);
        sumParallelStreamInterate(num);
        sumLongStreamInterate(num);
        sumParallelLongStreamInterate(num);


    }

    private static void sumfor(long num) {
        System.out.print("sun for: ");
        long result = 0;
        long unit = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - unit) + "ms");
    }

    private static void sumStreamInterate(long num) {
        System.out.print("sun StreamInterate: ");
        long unit = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - unit) + "ms");
    }

    private static void sumParallelStreamInterate(long num) {
        System.out.print("sun ParallelStreamInterate: ");
        long unit = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - unit) + "ms");
    }

    private static void sumLongStreamInterate(long num) {
        System.out.print("sun sumLongStreamInterate: ");
        long unit = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - unit) + "ms");
    }

    private static void sumParallelLongStreamInterate(long num) {
        System.out.print("sun sumParallelLongStreamInterate: ");
        long unit = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - unit) + "ms");
    }



}
