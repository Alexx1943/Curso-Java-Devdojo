package Parte06OrientacaoObjetos.OPolimorfismo.Dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor){
        super(nome,valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return valor * IMPOSTO_POR_CENTO;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
    public String getDataValidade(){
        return this.dataValidade;
    }


}
