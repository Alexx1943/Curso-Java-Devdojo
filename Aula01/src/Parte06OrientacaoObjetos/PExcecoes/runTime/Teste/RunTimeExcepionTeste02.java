package Parte06OrientacaoObjetos.PExcecoes.runTime.Teste;

public class RunTimeExcepionTeste02 {
    public static void main(String[] args) {
        divisao(1,2);
        System.out.println(divisao(10,0));

    }

    private static int divisao(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser o 0.");
        }
        return a/b;
    }
}
