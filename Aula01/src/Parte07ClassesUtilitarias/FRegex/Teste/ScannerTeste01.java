package Parte07ClassesUtilitarias.FRegex.Teste;

public class ScannerTeste01 {
    public static void main(String[] args) {

        String texto = "Alex, Allan, Luan, Bia, true, 200";
        String[] nomes = texto.split(",");

        for (String nome : nomes){
            System.out.println(nome.trim());
        }



    }
}
