package Parte07ClassesUtilitarias.FRegex.Teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {

        String texto = "Alex, Allan, Luan, Bia, true, 200";
        String[] nomes = texto.split(",");

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.hasNextBoolean();
                System.out.println("boolean: " + b);
            } else System.out.println(scanner.next());
        }


    }
}
