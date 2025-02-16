package Parte06OrientacaoObjetos.PExcecoes.Error.Teste;

public class SteckOverFlowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
