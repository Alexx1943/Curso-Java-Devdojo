package Parte06OrientacaoObjetos.KModificadorFinal.Dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }










}
