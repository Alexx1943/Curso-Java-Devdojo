package Parte07ClassesUtilitarias.BString.Teste;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("concatString Tempo de execução: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuilder tempo de execução: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("StringBuffer tempo de execução: " + (fim - inicio) + "ms");


    }
    private static void concatString(int tamanho){

        String texto = "";
        for (int i = 0; i < tamanho; i++){
            texto += i;
        }

    }
    private static void concatStringBuilder(int tamanho){
       StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
