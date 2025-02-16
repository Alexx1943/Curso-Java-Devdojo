package Parte06OrientacaoObjetos.PExcecoes.runTime.Teste;

public class RunTimeExceptionTeste03 {
    public static void main(String[] args) {

        abreConexao();

    }
    private static String abreConexao(){

        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("fechando recursos liberados pelo SO");
        }
        return null;

    }
}
